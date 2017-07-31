package main.java.com.ua.model.entity;

import java.util.Date;

/**
 * Created by Alexandr on 30.07.2017.
 */
public class Record {

    private Fullname fullname;
    private String nickname;
    private String description;
    private Group group;
    private Phone phone;
    private String email;
    private String skype;
    private Address address;
    private Date dateOfEntryInNoteBook;
    private Date dateOfLastChanging;

    public Builder getBuilder() {
        return new Builder();
    }

    public class Builder {

        public Builder setFullname(Fullname fullname) {
            Record.this.fullname = fullname;
            return this;
        }

        public Builder setNickname(String nickname) {
            Record.this.nickname = nickname;
            return this;
        }

        public Builder setDescription(String description) {
            Record.this.description = description;
            return this;
        }

        public Builder setGroup(Group group) {
            Record.this.group = group;
            return this;
        }

        public Builder setPhone(Phone phone) {
            Record.this.phone = phone;
            return this;
        }

        public Builder setSkype(String skype) {
            Record.this.skype = skype;
            return this;
        }

        public Builder setEmail(String email) {
            Record.this.email = email;
            return this;
        }

        public Builder setAddress(Address address) {
            Record.this.address = address;
            return this;
        }

        public Builder setDateOfLastChanging(Date dateOfLastChanging) {
            Record.this.dateOfLastChanging = dateOfLastChanging;
            return this;
        }

        public Record build() {
            return Record.this;
        }
    }

    public void refreshDateOfEntryInNoteBook() {
        dateOfEntryInNoteBook = new Date();
    }

    public Fullname getFullname() {
        return fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDescription() {
        return description;
    }

    public Group getGroup() {
        return group;
    }

    public Phone getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDateOfEntryInNoteBook() {
        return dateOfEntryInNoteBook;
    }

    public Date getDateOfLastChanging() {
        return dateOfLastChanging;
    }

    public void setFullname(Fullname fullname) {
        this.fullname = fullname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDateOfEntryInNoteBook(Date dateOfEntryInNoteBook) {
        this.dateOfEntryInNoteBook = dateOfEntryInNoteBook;
    }

    public void setDateOfLastChanging(Date dateOfLastChanging) {
        this.dateOfLastChanging = dateOfLastChanging;
    }
}
