ackage com.example.user.foodfix_12.fragments;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.fragments.CardsAdapter;

import java.util.ArrayList;

public class CardsAdapter_Rest extends RecyclerView.Adapter<CardsAdapter_Rest.CardRestViewHolder> {

    private final List<Card_Rest> cards_rest;

    public CardsAdapter_Rest() {
        cards_rest = new ArrayList<>();
    }


    @Override
    public CardRestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_view, parent, false);
        return new CardRestViewHolder(view);

    @Override
    public void onBindViewHolder(CardRestViewHolder holder, int position) {
        Card_Rest card_rest = cards_rest.get(position);
        holder.titler.setText(card_rest.getTitler());
        holder.message_timer.setText(card_rest.getMessage_timer());
        holder.message_payr.setText(card_rest.getMessage_payr());
        holder.message_statusr.setText(card_rest.getMessage_statusr());
        holder.message_placer.setText(card_rest.getMessage_placer());
    }

    @Override
    public int getItemCount() {
        return cards_rest.size();
    }

    public void addCards_rest(List<Card_Rest> items) {
        cards_rest.addAll(items);
    }

    static class CardRestViewHolder extends RecyclerView.ViewHolder {

        TextView card_rest_titler;
        TextView card_rest_message_timer;
        TextView card_rest_message_payr;
        TextView card_rest_message_statusr;
        TextView card_rest_message_placer;

        CardRestViewHolder(View itemView) {
            super(itemView);
            card_rest_titler = itemView.findViewById(R.id.card_rest_titler);
            card_rest_message_timer = itemView.findViewById(R.id.card_rest_message_timer);
            card_rest_message_payr = itemView.findViewById(R.id.card_rest_message_payr);
            card_rest_message_statusr = itemView.findViewById(R.id.card_rest_message_statusr);
            card_rest_message_placer = itemView.findViewById(R.id.card_rest_message_placer);
        }
    }

}