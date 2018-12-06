public class IkeaApplication {
    public static void main(String[] args) {
        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobes = new Wardrobe();
        System.out.println( wardrobeBuilder.build(wardrobes));
    }
}
