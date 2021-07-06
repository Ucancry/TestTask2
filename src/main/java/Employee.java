class Employee {
    //Builder
    private String nameRus, nameEng, surnameRus, surnameEng, dob, office, project, email, skype, department, phone;
    private int numberOfPaidVacDays, numberOfUnpaidVacDays, numberOfPaidSickLeaveDays, numberOfSickDays;

    private Employee(Builder builder){
        this.nameRus = builder.nameRus;
        this.nameEng = builder.nameEng;
        this.surnameRus = builder.surnameRus;
        this.surnameEng = builder.surnameEng;
        this.dob = builder.dob;
        this.office = builder.office;
        this.project = builder.project;
        this.email = builder.email;
        this.skype = builder.skype;
        this.department = builder.department;
        this.phone = builder.phone;
        this.numberOfUnpaidVacDays = builder.numberOfUnpaidVacDays;
        this.numberOfPaidSickLeaveDays = builder.numberOfPaidSickLeaveDays;
        this.numberOfPaidVacDays = builder.numberOfPaidVacDays;
        this.numberOfSickDays = builder.numberOfSickDays;
    }

    public static class Builder{
        private String nameRus, nameEng, surnameRus, surnameEng, dob, office, project, email, skype, department, phone;
        private int numberOfPaidVacDays, numberOfUnpaidVacDays, numberOfPaidSickLeaveDays, numberOfSickDays;

        public Builder(String nameRus, String surnameRus){
            this.nameRus = nameRus;
            this.surnameRus = surnameRus;
        }
        public Builder nameEng(String nameEng){
            this.nameEng = nameEng;
            return this;
        }
        public Builder surnameEng(String surnameEng){
            this.surnameEng = surnameEng;
            return this;
        }
        public Builder dob(String dob){
            this.dob = dob;
            return this;
        }
        public Builder office(String office){
            this.office = office;
            return this;
        }
        public Builder project(String project){
            this.project = project;
            return this;
        }
        public Builder email(String email){
            this.email= email;
            return this;
        }
        public Builder skype(String skype){
            this.skype = skype;
            return this;
        }
        public Builder department(String department){
            this.department = department;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder numberOfPaidVacDays(int numberOfPaidVacDays){
            this.numberOfPaidVacDays = numberOfPaidVacDays;
            return this;
        }
        public Builder numberOfUnpaidVacDays(int numberOfUnpaidVacDays){
            this.numberOfUnpaidVacDays = numberOfUnpaidVacDays;
            return this;
        }
        public Builder numberOfPaidSickLeaveDays(int numberOfPaidSickLeaveDays){
            this.numberOfPaidSickLeaveDays = numberOfPaidSickLeaveDays;
            return this;
        }
        public Builder numberOfSickDays(int numberOfSickDays){
            this.numberOfSickDays = numberOfSickDays;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }


    }
}


