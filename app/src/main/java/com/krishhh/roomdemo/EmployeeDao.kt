package com.krishhh.roomdemo

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface EmployeeDao {

    // A suspend insert function for saving an entry
    @Insert
    suspend fun insert(employeeEntity: EmployeeEntity)

    // A suspend update function for updating an existing entry
    @Update
    suspend fun update(employeeEntity: EmployeeEntity)

    // A suspend delete function for deleting an existing entry
    @Delete
    suspend fun delete(employeeEntity: EmployeeEntity)

    // A function to read all employee, this returns a Flow
    @Query("Select * from `employee-table`")
    fun fetchAllEmployees():Flow<List<EmployeeEntity>>

    // A function to read one employee, this returns a Flow
    @Query("Select * from `employee-table` where id=:id")
    fun fetchEmployeeById(id:Int):Flow<EmployeeEntity>
}