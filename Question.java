import java.awt.Color;
import java.util.*;

public class Question{
  private String color_name;
  private Color color;
  private List<Color> color_list;

  public Question(String cN, Color c, List<Color> lC){
    this.color_name = cN;
    this.color = c;
    this.color_list = lC;
  }

  public String getColor_name(){
    return this.color_name;
  }

  public Color getColor(){
    return this.color;
  }

  public String getColorToString(){
    return this.color.toString();
  }

  public List<Color> getColor_list(){
    return this.color_list;
  }
}
