import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> string;
  public RandomStringChooser(String[] word){
    string = new ArrayList <String>();
    for (String w: word)
      string.add(w);
  }

  public String getNext(){
    if (string.size<=0)
      return "NONE";
    else 
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
