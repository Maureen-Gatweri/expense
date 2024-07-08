package com.akirachix.enwalletplatform

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ExpenseAdapter(var expenses:List<Expense_holder>):RecyclerView.Adapter<ExpensesHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpensesHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.enexpenditure, parent, false)
        return ExpensesHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExpensesHolder, position: Int) {
        val expenses = expenses[position]
        holder.tvAmount.text =expenses.money
        holder.tvMoney.text=expenses.date
        holder.tvMoney.text=expenses.amount
    }


    override fun getItemCount(): Int {
        return expenses.size
    }
}
class ExpensesHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvMoney = itemView.findViewById<TextView>(R.id.tvmoney)
    var tvAmount=itemView.findViewById<TextView>(R.id.tvamount)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)

}


