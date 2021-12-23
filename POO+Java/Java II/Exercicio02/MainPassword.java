import java.util.Scanner;
import java.util.regex.Pattern;

public class MainPassword {

    public static void main(String[] args) {


                /* SENHA FORTE - definida por no mínimo de oito caracteres, pelo menos uma letra maiúscula, uma letra minúscula, um número e um caractere especial: */
                PasswordForte passwordForte = new PasswordForte(Pattern.compile("^(?=.*?[A-Z])(?=(.*[a-z])+)(?=(.*[\\d])+)(?=(.*[\\W])+)(?!.*\\s).{8,}$", Pattern.MULTILINE));
                /* SENHA MEDIA - definida por no mínimo de oito caracteres, pelo menos uma letra, um número e um caractere especial: */
                PasswordMedia passwordMedia = new PasswordMedia(Pattern.compile("^(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*#?&])[a-z\\d@$!%*#?&]{8,}$", Pattern.MULTILINE));
                /* SENHA FRACA - definida por no mínimo de oito caracteres, pelo menos uma letra e um número: */
                PasswordFraca passwordFraca = new PasswordFraca(Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", Pattern.MULTILINE));

                

    }
}


