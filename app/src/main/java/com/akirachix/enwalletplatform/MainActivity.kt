package com.akirachix.enwalletplatform

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.enwalletplatform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.rvExpense.layoutManager = LinearLayoutManager(this)
        displayEcpenses()

        }
    fun displayEcpenses(){
        val worker1= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker2= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker3= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker4= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker5= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker6= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker7= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker8= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker9= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker10= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker11= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker12= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker13= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker14= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker15= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker16= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker17= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker18= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker19= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker20= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker21= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker22= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker23= Expense_holder("1","Salary","Kes 4567","23/09/2023")
        val worker24= Expense_holder("1","Salary","Kes 4567","23/09/2023")

        val myWorker= listOf(worker1,worker2,worker3,worker4,worker5,worker6,worker7,worker8,worker9,worker10,worker11,worker12,worker13,worker14,worker15,worker16,worker17,worker18,worker19,worker20,worker21,worker22,worker23,worker24)




    }
    }

//
//val myContacts= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12)
//
//val contactsAdapter=ContactsAdapter(myContacts)
//binding.rvContacts.adapter=contactsAdapter

