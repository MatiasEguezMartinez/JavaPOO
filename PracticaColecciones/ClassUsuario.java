public class ClassUsuario {
    //region ATRIBUTOS
    private String _name;
    private String _direction;
    private String _phone;
    //endregion

    //region PROPIEDADES
        public String getName() {return _name;}
        public void setName(String Name) {this._name=Name;}



        public String getDirection() {return _direction;}
        public void setDirection(String Direction) {this._direction = Direction;}



        public String getPhone() {return _phone;}
        public void setPhone(String Phone) {this._phone = Phone;}
    //endregion

    //region CONSTRUCTOS
        public ClassUsuario(String Name, String Direction, String Phone){
            setName(Name);
            setDirection(Direction);
            setPhone(Phone);
        }
    //endregion
}
