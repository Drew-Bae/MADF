package cs.mad.flashcards.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.entities.Flashcard

class FlashcardAdapter (val dataSet: List<Flashcard>):
    RecyclerView.Adapter<FlashcardAdapter.ViewHolder>(){
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.textView2)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder{
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_flashcard_set, viewGroup, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView.text = dataSet[position].question
        viewHolder.textView.text = dataSet[position].answer
    }

    override fun getItemCount()= dataSet.size
}
