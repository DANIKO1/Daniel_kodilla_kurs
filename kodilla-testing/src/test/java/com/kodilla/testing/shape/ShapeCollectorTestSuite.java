package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Class methods test")
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        //When
        shapeCollector.addFigure(shape);
        //Then
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigure(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(4);
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        assertTrue(result);
        assertEquals(0, shapeCollector.getShapeCollection().size());
    }

    @Test
    public void testRemoveFigureWhichDoesNotExist(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Square(5));
        //When
        boolean result = shapeCollector.removeFigure(new Square(4));
        //Then
        assertFalse(result);
        assertEquals(1, shapeCollector.getShapeCollection().size());
    }
}
