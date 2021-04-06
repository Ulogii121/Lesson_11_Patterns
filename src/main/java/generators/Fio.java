package generators;

public class Fio {
    private String lastName;
    private String firstName;
    private String middleName;

    public final void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public final void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public final void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    @Override
    public final String toString() {
        return lastName + ' ' + firstName + ' ' + middleName;
    }

}
