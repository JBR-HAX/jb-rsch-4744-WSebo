package payroll;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Coordinates {

  private @Id @GeneratedValue Long id;
  private int x;
  private int y;

  Coordinates() {}

  Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Long getId() {
    return this.id;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }
  
    @Override
    public boolean equals(Object o) {
  
      if (this == o)
        return true;
      if (!(o instanceof Coordinates))
        return false;
      Coordinates coordinates = (Coordinates) o;
      return Objects.equals(this.id, coordinates.id) && Objects.equals(this.x, coordinates.x)
          && Objects.equals(this.y, coordinates.y);
    }
  
    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.x, this.y);
    }
  
    @Override
    public String toString() {
      return "Coordinates{" + "id=" + this.id + ", x='" + this.x + '\'' + ", y='" + this.y + '\'' + '}';
    }
}