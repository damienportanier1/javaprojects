/*
Corrigé de la prof lisa murphy
17 10 2022
*/

public class StarSign {
    // vars
    private String month;
    private int date;
    private String sign;

    // constructor
    public StarSign(){
        month="";
        date=0;
        sign="";
	}
    //set
    public void setMonth(String month){
        this.month=month;
    }
    public void setDate(int date){
        this.date=date;
    }

    //compute
    public void compute(){
        if(month.equals("January")){
            if(date>=1&&date<=19){
                sign="Capricorn";
            }
            else{
                sign="Aquarius";
            }
		}
        else if(month.equals("February")){
            if(date>=1&&date<=18){
                sign="Aquarius";
            }
            else{
                sign="Pieces";
            }
        }

        }
    //outputs
    public String getSign(){
        return sign;//
    }
    }