package com.example.societology.model;



public class User {

        private int user_id;
        private String name;
        private String email;
        private String password;
        private int active;
        private int societyid;

    public int getActive() {
        return active;
    }

    public User(String name, String email, String password, int societyid) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.societyid = societyid;
        }

    public User(int user_id, String name, String email, String password, int active) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public User(String name, String email, String password){
            this.name = name;
            this.email = email;
            this.password = password;
        }

        public User()
        {

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public void setSocietyid(int societyid) {
            this.societyid = societyid;
        }



        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public int getUser_id() {
            return user_id;
        }

        public int getSocietyid() {
            return societyid;
        }

        public String getPassword() {
            return password;
        }



    }


