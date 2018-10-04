/**
 * Created by Nicholas on 2017-08-29.
 */
import java.awt.Color;

public class BHTree {
    private Particle part;
    private Octant oct;
    private BHTree NWF;
    private BHTree NWB;
    private BHTree NEF;
    private BHTree NEB;
    private BHTree SWF;
    private BHTree SWB;
    private BHTree SEF;
    private BHTree SEB;

    public BHTree (Octant O){
        this.oct=O;
        this.part=null;
        this.NWF=null;
        this.NWB=null;
        this.NEF=null;
        this.NEB=null;
        this.SWF=null;
        this.SWB=null;
        this.SEF=null;
        this.SEB=null;
    }

    public boolean isExternal(BHTree t){
        if (t.NWF==null && t.NWB==null && t.NEF==null && t.NEB==null && t.SWF==null && t.SWB==null && t.SEF==null && t.SEB==null )
            return true;
        else return false;
    }

    public void insert(Particle p){
        // no particle, put particle
        if (this.part==null){
            this.part = p;
        }

        else if (!this.isExternal(this)){
           // this.part=p.add(this.part,p);
        }
    }

}
