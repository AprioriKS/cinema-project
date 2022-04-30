package cinema.dto.request;

import cinema.validation.ValidPassword;
import javax.validation.constraints.Email;

@ValidPassword
public class UserRequestDto {
    @Email
    private String email;
    private String password;
    private String repeatPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }
}
