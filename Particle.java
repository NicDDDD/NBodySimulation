/**
 * Created by Nicholas on 2017-08-08.
 */
import java.awt.Color;

public class Particle {
    private static final double G = 6.673e-11;
    private static final double Solarmass = 1.98892e30;

    public double rx, ry, rz;
    public double vx, vy, vz;
    public double fx, fy, fz;
    public double mass;
    public Color colour;

    public Particle(double rx, double ry, double rz, double vx, double vy, double vz,
                double fx, double fy, double fz, double mass, Color color){
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.fx = fx;
        this.fy = fy;
        this.fz = fz;
        this.mass  = mass;
        this.colour = color;
    }

    public void update(double dt){
        vx += dt*fx/mass;
        vy += dt*fy/mass;
        vz += dt*fz/mass;
        rx += dt*vx;
        ry += dt*vy;
        rz += dt*vz;
    }

    public double distance(Particle p){
        double dx = rx - p.rx;
        double dy = ry - p.ry;
        double dz = rz - p.rz;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public void resetForce(){
        fx = 0.0;
        fy = 0.0;
        fz = 0.0;
    }

    public void addForce(Particle p){
        Particle p1 = this;
        double EPS = 3E4;
        double dx = p.rx - p1.rx;
        double dy = p.ry - p1.ry;
        double dz = p.rz - p1.rz;
        double dist = Math.sqrt(dx*dx* + dy*dy + dz*dz);
        double F = (G*p1.mass*p.mass)/(dist*dist + EPS*EPS);
        p1.fx = F*dx/dist;
        p1.fy = F*dy/dist;
        p1.fz = F*dz/dist;
    }

    public boolean in(Octant O){
        return O.contains(this.rx, this.ry, this.rz);
    }

    public String toString(){
        return "" + rx + ", "+ ry + ", "+ rz + ", "+ vx + ", "+ vy + ", "+ vz + ", " + mass;
    }


}
