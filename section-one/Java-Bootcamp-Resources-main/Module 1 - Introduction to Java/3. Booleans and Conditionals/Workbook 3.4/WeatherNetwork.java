public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 9;  

        String forecast = "";

        if(temp <= -1)
        {
            forecast = "The forecast is FREEZING! Stay home!";
        }
        else if(temp <= 10)
        {
            forecast = "The forecast is chilly. Wear a coat!";
        }
        else
        {
            forecast = "Its warm. Go outside!";
        }
        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        
        System.out.println(forecast);
    }
}
