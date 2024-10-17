package ku.cs.kafe.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author Thanawat Potidet 6510450445
 * @version 1.0
 * @since 2024-10-17
 */

public class PasswordConstraintValidator implements ConstraintValidator<ValidPassword, String> {

    @Override
    public void initialize(ValidPassword constraintAnnotation) {

    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {

        if (Pattern.compile("[0-9]").matcher(password).find() &&
                password.length() >= 12 && password.length() <= 128) {
            return true;
        }

        context.buildConstraintViolationWithTemplate("must contain at least one digit with size 12-128 characters")
                .addConstraintViolation()
                .disableDefaultConstraintViolation();

        return false;
    }
}
