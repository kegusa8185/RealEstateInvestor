import java.util.ArrayList;
public class Main {
    double years = 0;
    double playerNetWorth = 0;
    double playerBankAccount = 0;
    double income = 0;
    double loanAmount = 0;
    double debt = 0;
    ArrayList<Houses> property = new ArrayList<Houses>();
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        //Game();
    }

    public void game(){

    }
    public void nextTerm(){
        for (int i = 0; i < property.size(); i++) {
            property.get(i).setValue((property.get(i).getTermPercentIncrease() + 1) * property.get(i).getValue());
            playerBankAccount = playerBankAccount - debt;
        }
    }

}
