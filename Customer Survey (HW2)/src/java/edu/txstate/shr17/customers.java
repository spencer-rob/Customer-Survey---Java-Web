/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.txstate.shr17;

/**
 *
 * @author spenc
 */
public class customers {

    public customers() {
    }

    public customers(String firstName, String lastName, String email, String heardAbout, String yes, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.heardAbout = heardAbout;
        this.yes = yes;
        this.contact = contact;
    }

    
    @Override
    public String toString() {
        return "customers{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
        
    private String firstName;

    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of firstName
     *
     * @param firstName new value of firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

        private String lastName;

    /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of lastName
     *
     * @param lastName new value of lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

        private String heardAbout;

    /**
     * Get the value of heardAbout
     *
     * @return the value of heardAbout
     */
    public String getHeardAbout() {
        return heardAbout;
    }

    /**
     * Set the value of heardAbout
     *
     * @param heardAbout new value of heardAbout
     */
    public void setHeardAbout(String heardAbout) {
        this.heardAbout = heardAbout;
    }

        private String yes;

    /**
     * Get the value of yes
     *
     * @return the value of yes
     */
    public String getYes() {
        return yes;
    }

    /**
     * Set the value of yes
     *
     * @param yes new value of yes
     */
    public void setYes(String yes) {
        this.yes = yes;
    }

        private String contact;

    /**
     * Get the value of contact
     *
     * @return the value of contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Set the value of contact
     *
     * @param contact new value of contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

}
