public class PopFilter implements GenreFilter{
    //This structure can be used for other specific filters too, just change the enum on row 5
    @Override
    public boolean permit(Album album) {
        if (album.genre() == Album.Genre.POP.toString()){
            return true;
        }
        return false;
    }
}
