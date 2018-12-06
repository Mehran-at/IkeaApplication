import java.util.List;
import java.util.Arrays;
//  Create the WardrobeBuilder class that has a list of all the Steps it has to follow to build a wardrobe
public class WardrobeBuilder {
    List<Step> steps = Arrays.asList(new AddSide(),new AddSide(), new AddTop(), new AddBottom(),new AddBack(),
            new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),new AddShelf(),
            new AddShelf(), new AddDoor(), new AddDoor());
//  It has the build method. It has the build method. It creates an empty Wardrobe and applies all the steps one by
// one to it until it’s finished and then it returns it.
    public Wardrobe build(Wardrobe wardrobes) {
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }
}
//                       //has a list of all the Steps it has to follow to build a wardrobe.
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//public class WardrobeBuilder {
//   private List<Step> steps = getSteps();
//                      //has the build method. It creates an empty Wardrobe and
//                      //applies all the steps one by one to it until it’s finished
//                      //and then it returns it.
//   public Wardrobe build() {
//       Wardrobe wardrobe = new Wardrobe();
//       for (Step step : steps) {
//           step.perform(wardrobe);
//       }
//       return wardrobe;
//   }
//                    // todo:
//                   // A Wardrobe needs the following to be completed: one bottom,
//                  //two sides, one back, one top,eight shelves and two doors.
//   public List<Step> getSteps() {
//       AddBottom bottom = new AddBottom();
//       AddSide side = new AddSide();
//       AddBack back = new AddBack();
//       AddTop top = new AddTop();
//       AddShelf shelf = new AddShelf();
//       AddDoor door = new AddDoor();
//       List<Step> steps = Arrays.asList(bottom, side, side, back, top, shelf,
//               shelf, shelf, shelf, shelf, shelf, shelf, shelf, door, door);
//       return steps;
//   }
//}