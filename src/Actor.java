import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(String name, String surname, double height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Actor)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        Actor actor = (Actor) object;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) && Objects.equals(getHeight(), actor.getHeight());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getHeight());
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() +
                " (" + getHeight() + ")";
    }

    public double getHeight() {
        return height;
    }


}

