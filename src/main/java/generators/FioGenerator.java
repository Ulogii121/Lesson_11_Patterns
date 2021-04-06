package generators;

import static utils.FileReader.getLinesFromFile;
import static utils.MyMath.getDigitsSum;

public class FioGenerator {
    private final Fio fio = new Fio();

    public final Fio getFio() {
        return fio;
    }

    /**
     * ФИО берутся из соответствующих файлов по индексу в листе:
     * Фамилия - сумма цифр в коде
     * Имя - сумма первых двух цифр
     * Отчество - сумма последних двух цифр.
     *
     * @param code код для генерации
     */
    public final void generateParams(final int code) {
        final int lastNameIndex = getDigitsSum(code);
        final String sex = (lastNameIndex % 2 == 0) ? "f" : "m";
        setNameFromFile(lastNameIndex, getDigitsSum(code / 100), getDigitsSum(code % 100), sex);
    }

    private void setNameFromFile(final int i, final int j, final int k, final String sex) {
        fio.setLastName(getLinesFromFile("lastNames_" + sex).get(i));
        fio.setFirstName(getLinesFromFile("names_" + sex).get(j));
        fio.setMiddleName(getLinesFromFile("middleNames_" + sex).get(k));
    }


}


