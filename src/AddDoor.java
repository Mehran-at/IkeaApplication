//     Create the AddSide, AddTop, AddBottom, AddBack, AddShelf and AddDoor classes. They implement Step. Each one of
// them adds only one part of the following respectively to the furniture: side, top, bottom, back, shelf and door.
public class AddDoor implements Step {
    @Override
    public void perform(Furniture furniture) {
        furniture.add("Door");
    }
}
