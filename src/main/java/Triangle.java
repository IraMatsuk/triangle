public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle setSides(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        return this;
    }

    public Triangle(int sideA, int sideB, int sideC) {
        setSides(sideA, sideB, sideC);
    }

    public boolean isPositiveNumbers() {
        return sideA > 0 && sideB > 0 && sideC > 0;
    }

    public boolean isTriangle() {
        return (sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC) > sideB;
    }

    public boolean isEquilateralTriangle() {
        return (sideA == sideB) && (sideB == sideC) && (sideA == sideC);
    }

    public boolean isIsoscelesTriangle() {
        return (sideA == sideB) || (sideB == sideC);
    }

    public String triangleType() {
        String output = "";
        if (isPositiveNumbers()) {
            if (isTriangle()) {
                if (isEquilateralTriangle()) {
                    if(isIsoscelesTriangle())
                        output = "This is an isosceles triangle";
                    else
                        output = "This is an equilateral triangle";
                } else
                    output = "This is a scalene triangle";
            }  else
                output = "There is no triangle with such sides";
        } else
            output = "Wrong numbers";
        return output;
    }
}
