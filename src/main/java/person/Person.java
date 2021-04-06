package person;

import generators.Fio;
import person.appearance.Appearance;

public class Person {

    private String id;
    private Fio fio;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%1$s", fio.toString())).append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }

    //Вложенный класс Builder
    public static class PersonBuilder {

        private final String id;
        private Fio fio;
        private Physical phys;
        private Appearance appearance;
        private Phone phone;

        public PersonBuilder(final String id) {
            this.id = id;
        }

        public final PersonBuilder withFio(final Fio fio1) {
            this.fio = fio1;
            return this;
        }

        public final PersonBuilder withPhys(final Physical phys1) {
            this.phys = phys1;
            return this;
        }

        public final PersonBuilder withAppearance(final Appearance appearance1) {
            this.appearance = appearance1;
            return this;
        }

        public final PersonBuilder withPhone(final Phone phone1) {
            this.phone = phone1;
            return this;
        }

        public final Person build() {
            final Person person = new Person();
            person.id = this.id;
            person.fio = this.fio;
            person.phys = this.phys;
            person.appearance = this.appearance;
            person.phone = this.phone;
            return person;
        }
    }
}