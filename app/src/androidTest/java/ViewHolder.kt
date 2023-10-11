import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projectbp2643.test.R

class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {
    val image:ImageView = itemView.findViewById(R.id.imageViewBook)
    val title:TextView = itemView.findViewById(R.id.textViewTitle)
    val desc:TextView = itemView.findViewById(R.id.textViewDesc)

}