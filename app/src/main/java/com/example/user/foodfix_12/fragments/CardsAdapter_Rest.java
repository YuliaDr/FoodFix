//ackage com.example.user.foodfix_12.fragments;
//
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import com.example.user.foodfix_12.R;
//import com.example.user.foodfix_12.fragments.Card_Rest;
//
//import java.util.List;
//
//public class CardsAdapter_Rest extends RecyclerView.Adapter<com.example.user.foodfix_12.fragments.CardsAdapter.Card_RestViewHolder> {
//
//    private final List<Card_Rest> cards;
//
//    @Override
//    public com.example.user.foodfix_12.fragments.CardsAdapter.Card_RestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_view, parent, false);
//        return new com.example.user.foodfix_12.fragments.CardsAdapter.Card_RestViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(com.example.user.foodfix_12.fragments.CardsAdapter.Card_RestViewHolder holder, int position) {
//        Card_Rest card = cards.get(position);
//        holder.title.setText(card.getTitle());
//        holder.message_time.setText(card.getMessage_time());
//        holder.message_pay.setText(card.getMessage_pay());
//        holder.message_status.setText(card.getMessage_status());
//        holder.message_place.setText(card.getMessage_place());
//    }
//
//    @Override
//    public int getItemCount() {
//        return cards.size();
//    }
//
//    public void addCards(List<Card_Rest> items) {
//        cards.addAll(items);
//    }
//
//    static class CardViewHolder extends RecyclerView.ViewHolder {
//
//        TextView title;
//        TextView message_time;
//        TextView message_pay;
//        TextView message_status;
//        TextView message_place;
//
//        CardViewHolder(View itemView) {
//            super(itemView);
//            title = itemView.findViewById(R.id.card_title);
//            message_time = itemView.findViewById(R.id.card_message_time);
//            message_pay = itemView.findViewById(R.id.card_message_pay);
//            message_status = itemView.findViewById(R.id.card_message_status);
//            message_place = itemView.findViewById(R.id.card_message_place);
//        }
//    }
//
//}