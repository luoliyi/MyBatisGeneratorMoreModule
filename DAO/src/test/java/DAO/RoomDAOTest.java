package DAO;

import entities.Room;
import entities.RoomExample;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RoomDAOTest {

    RoomDAO dao=null;

    @Before
    public void setUp() throws Exception {
        dao=new RoomDAO();
    }

    @Test
    public void selectByExample() {
        List<Room> rooms= dao.selectByExample(new RoomExample());
        System.out.println(rooms);
    }

}