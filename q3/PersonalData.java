package week1.hw1.git.q3;

import java.time.LocalDate;

public class PersonalData {
    private LocalDate birthDate;
    private String address;
    private long ssn; //social security number

    public PersonalData(LocalDate birthDate, long ssn ){
        this.birthDate = birthDate;
        this.ssn = ssn;
    }
    public PersonalData(int year, int month, int day, long ssn){
        birthDate = LocalDate.of(year, month, day);
        this.ssn = ssn;
    }



    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
}
