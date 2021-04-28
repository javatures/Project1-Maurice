/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.github.mauriceliddy.Project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import com.github.mauriceliddy.Project1.DataManagement.*;
import com.github.mauriceliddy.Project1.Model.*;


class DaoTest {
    @Test 
    void basicTest() {
        assertEquals(1, 1);
         
    }

    @Test
  public void testAthleteGetAll() {

    DataInput dataInput = new DataInput();
    List<Workout> masterList = dataInput.readInData();
    UserDatabaseAccess uAccess = new UserDatabaseAccess();
    uAccess.sendCSVDataToDatabase(masterList);
    List<UserAccount> athleteListFromDB = new ArrayList<>();
    athleteListFromDB = uAccess.getUsers();
    assertEquals(4, athleteListFromDB.size());

  }
/*
  @Test
  public void testWorkoutGetAll() {

    DataInput dataInput = new DataInput();
    List<Workout> masterList = dataInput.readInData();
    UserDatabaseAccess uAccess = new UserDatabaseAccess();
    uAccess.sendCSVDataToDatabase(masterList);
    List<Workout> workoutListFromDB = new ArrayList<>();
    workoutListFromDB = uAccess.retrieveAllFromDb();
    assertEquals(20, workoutListFromDB.size());

  }
*/
    
  @Test
  void testMasterListIsPopulated() {
    DataInput dataInput = new DataInput();
    List<Workout> masterList = dataInput.readInData();
      assertNotNull(masterList);
  }

  @Test
  void testWorkoutNumber() {
    DataInput dataInput = new DataInput();
    List<Workout> masterList = dataInput.readInData();
      assertEquals(20, masterList.size());
  }
}
