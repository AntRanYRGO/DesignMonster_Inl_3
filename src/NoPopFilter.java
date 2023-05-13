public class NoPopFilter implements GenreFilter{
    @Override
    public boolean permit(Album album) {
        if (album.genre() != Album.Genre.POP.toString()){
            return true;
        }
        return false;
    }
}
