
    import java.util.Objects;

    public class User {
        private String username;
        private String email;
        private String password;

        // Constructors
        public User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;
        }

        // Getters and Setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        // equals and hashCode methods
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;
            User user = (User) o;
            return Objects.equals(getUsername(), user.getUsername()) &&
                   Objects.equals(getEmail(), user.getEmail());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getUsername(), getEmail());
        }
    }
    // 