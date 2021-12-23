import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    private Pattern pattern;

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public void setValue(String pwd) throws PasswordException {
        Matcher matcher = pattern.matcher(pwd);
        boolean res = matcher.matches();
        if(!res)
            throw new PasswordException("Senha incompativel.");
    }
}
