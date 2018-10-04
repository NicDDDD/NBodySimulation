/**
 * Created by Nicholas on 2017-08-28.
 */


public class Octant {
    private double xmid, ymid, zmid, length, depth;
    public Octant(double xmid, double ymid, double zmid, double length, double depth){
        this.xmid=xmid;
        this.ymid=ymid;
        this.zmid=zmid;
        this.length=length;
        this.depth=depth;
    }

    public double getLength(){
        return length;
    }

    public double getDepth() {return depth;}

    public boolean contains(double xmid, double ymid, double zmid){
        if (xmid<=this.xmid+length/2.0 && xmid>=this.xmid-length/2.0 && ymid<=this.ymid+length/2.0 && ymid>=this.ymid-length/2.0
                && zmid<=this.zmid+depth/2.0 && zmid>=this.zmid-depth/2.0){
            return true;
        } else {return false;}
    }

    // Creation od subdivisions

    public Octant NWF(){
        Octant newOct = new Octant(this.xmid-this.length/4.0, this.ymid+this.length/4.0, this.zmid+this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant NWB(){
        Octant newOct = new Octant(this.xmid-this.length/4.0, this.ymid+this.length/4.0, this.zmid-this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant NEF(){
        Octant newOct = new Octant(this.xmid+this.length/4.0, this.ymid+this.length/4.0, this.zmid+this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant NEB(){
        Octant newOct = new Octant(this.xmid+this.length/4.0, this.ymid+this.length/4.0, this.zmid-this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant SWF(){
        Octant newOct = new Octant(this.xmid-this.length/4.0, this.ymid-this.length/4.0, this.zmid+this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant SWB(){
        Octant newOct = new Octant(this.xmid-this.length/4.0, this.ymid-this.length/4.0, this.zmid-this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant SEF(){
        Octant newOct = new Octant(this.xmid+this.length/4.0, this.ymid-this.length/4.0, this.zmid+this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

    public Octant SEB(){
        Octant newOct = new Octant(this.xmid-this.length/4.0, this.ymid-this.length/4.0, this.zmid-this.depth/4.0, this.length/2.0, this.depth/2.0);
        return newOct;
    }

}
