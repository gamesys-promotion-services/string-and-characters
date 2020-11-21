package com.example.demo.string;

public class StringSample {
    public static void main(String[] args) {
        Person person = new Person("  Robb!    ", "Banks", Gender.M);
        String salutation = getSalutation(person.getGender().getGenderValue());
        /**
         * mini exercise:
         * print out the name
         * Mr.Robb! Banks
         */
    }

    private static String getSalutation(String gender) {
        return gender == "female" ? "Ms. " : "Mr.";
    }

    private static class Person {
        private String firstName;
        private String lastName;
        private Gender gender;

        public Person(String firstName, String lastName, Gender gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gender = gender;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    enum Gender {
        M("male"), F("female");

        Gender(String male) {
        }
        private String genderValue;

        public String getGenderValue() {
            return genderValue;
        }
    }
}
