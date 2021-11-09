package data;
import java.util.ArrayList;
import java.util.List;

public class FzBzNode {
 public String data;

  public List <FzBzNode> subNode;


  public FzBzNode(String value) {
    this.data = value;

    subNode =new ArrayList<FzBzNode>();
  }

}
