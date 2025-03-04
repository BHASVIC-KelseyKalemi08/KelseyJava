    abstract class Animal {
    protected boolean  coldBlooded;
    protected boolean tail;
    protected String skinType;
    protected int legs;
    protected int arms;
    protected int wings;

    Animal(){
        this.coldBlooded = coldBlooded;
        this.skinType = skinType;
        this.tail = tail;
        this.legs = legs;
        this.arms = arms;
        this.wings = wings;
    }

    protected abstract void birth();
    protected abstract void move();
    protected abstract void eat();

    public void getInfo() {
        System.out.println("Animal:");
        if (this.coldBlooded)
            System.out.println("This animal is cold-blooded");
        else
            System.out.println("This animal is warm-blooded");
        if (this.skinType != null)
            System.out.println("This animal is covered in " + this.skinType);
        if (this.tail)
            System.out.println("This animal has a tail");
        if (this.legs > 0)
            System.out.println("This animal has " + this.legs + " legs");
        if (this.arms > 0)
            System.out.println("This animal has " + this.arms + " arms");
        if (this.wings > 0)
            System.out.println("This animal has " + this.wings + " wings");
        this.move();
        this.eat();
        this.birth();
        System.out.println();


}
}
