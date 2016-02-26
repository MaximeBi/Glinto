import java.awt.Color;
import java.util.*;

public class Enigme{
  private List<Color> colorlist;
  private List<String> colorNameList;

  public Enigme(){
    this.constructColor();
    this.constructColorName();
  }

  void constructColor(){
    this.colorlist = new ArrayList<Color>();
    this.colorlist.add(new Color(255,255,0));//Yellow
    this.colorlist.add(new Color(0,153,255));//Blue
    this.colorlist.add(new Color(255,0,0));//Red
    this.colorlist.add(new Color(0,255,0));//Green
    this.colorlist.add(new Color(255,153,0));//Orange
  }

  void constructColorName(){
    this.colorNameList = new ArrayList<String>();
    this.colorNameList.add(new String("YELLOW"));
    this.colorNameList.add(new String("BLUE"));
    this.colorNameList.add(new String("RED"));
    this.colorNameList.add(new String("GREEN"));
    this.colorNameList.add(new String("ORANGE"));
  }

  Question askQuestion(int indice){
    //Color c = new Color(this.colorlist.get(this.randomNumber(this.colorlist.size())));
    String s = new String(this.colorNameList.get(this.randomNumber(this.colorNameList.size())));
    this.split(colorlist);
    Question q = new Question(s, this.colorlist.get(this.randomNumber(this.colorlist.size())), this.colorlist);
    
    return q;
  }

  int randomNumber(int n){
    int min = 0,res = 0;
    int max = n - 1;

    res = min + (int)(Math.random() * ((max - min) + 1));

    return res;
  }

  void split(List<Color> colorlist){
    Collections.shuffle(colorlist);
  }
}
