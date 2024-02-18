public class ReturnValues {
    public static void main(String[] args) {
        //calculateArea(2.3,3.6);
        System.out.println(calculateArea(2.3,3.6));
        //calculateArea(3, 6);
        System.out.println(calculateArea(3, 6));
        System.out.println(explainArea("English"));
        System.out.println(explainArea("French"));
        System.out.println(explainArea("Spanish"));
        System.out.println(explainArea("Italian"));
    }
    public static double calculateArea(double length, double width)
{
    double area = length * width;
    return area;
}
    public static String explainArea(String language)
    {
        switch (language) {
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language unavailable";
                
        }
    }
}
// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"