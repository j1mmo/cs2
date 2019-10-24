public class GameObject {
    public GameObject(CanBeDrawn test, CanBeHit hit, CanBeMoved moved) {
        this.test = test;
        this.hit = hit;
        this.moved = moved;
    }
    public void update(){
        moved.move();
    }
    public void Draw(){
        test.draw();
    }
    public void collide(){
        hit.hit();
    }
    private CanBeDrawn test;
    private CanBeHit hit;
    private CanBeMoved moved;

}
