package dat3.cars.entity;

import dat3.security.entity.UserWithRoles;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;

@Entity
public class Member extends UserWithRoles {

    private String firstName;

    private String lastName;
    private String street;
    private String city;
    private int zip;
    private boolean approved;
    private String ranking;



    @CreationTimestamp
    @Column(name = "oprettet")
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    @Column(name = "opdateret")
    private LocalDateTime dateEdited;


    public Member(){

    }

    public Member(String user, String password, String email, String firstName, String lastName, String street, String city, int zip, boolean approved, String ranking) {
        super(user, password, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.approved = approved;
        this.ranking = ranking;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getRanking() {
        return ranking;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public LocalDateTime getDateEdited() {
        return dateEdited;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateEdited(LocalDateTime dateEdited) {
        this.dateEdited = dateEdited;
    }
}
