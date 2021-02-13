package cs.mad.flashcards.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.adapters.FlashcardSetAdapter
import cs.mad.flashcards.entities.FlashcardSet
import cs.mad.flashcards.entities.getHardcodedFlashcardSets

/*
===================================================================================================================

     Reference documentation for recyclers: https://developer.android.com/guide/topics/ui/layout/recyclerview

===================================================================================================================
 */

class MainActivity : AppCompatActivity(), FlashcardSetAdapter.OnItemClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<RecyclerView>(R.id.flashcardSet_View).adapter=FlashcardSetAdapter(
            getHardcodedFlashcardSets(), this)

        /*
            connect to views using findViewById
            setup views here - recyclerview, button
            don't forget to notify the adapter if the data set is changed
         */
        //START OF TEST
        findViewById<RecyclerView>(R.id.flashcardSet_View).setOnClickListener {
            startActivity(Intent(this, FlashcardSetDetailActivity::class.java))
        }
    }
    override fun onItemClick(position: Int) {
        /*Toast.makeText(this, "Item $position clicked", Toast.LENGTH_SHORT).show()
        val clickedItem = getHardcodedFlashcardSets()[position]
        clickedItem.title = "Clicked"*/
        val intent = Intent(this, FlashcardSetDetailActivity::class.java)
        startActivity(intent)
        //now it crashes when clicked x.x

    }

}