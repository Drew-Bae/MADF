package cs.mad.flashcards.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import cs.mad.flashcards.R
import cs.mad.flashcards.adapters.FlashcardAdapter
import cs.mad.flashcards.entities.Flashcard
import cs.mad.flashcards.entities.getHardcodedFlashcards

class FlashcardSetDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flashcard_set_detail)

        findViewById<RecyclerView>(R.id.Flashcard_View).adapter=FlashcardAdapter(
            getHardcodedFlashcards()
        )

    }
}