public class PasswordException extends Exception{

    public PasswordException(){
        super();
    }

    public PasswordException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Algo deu errado: "+this.getClass().getName() + "\nMesagem: "+this.getMessage();
    }
}
