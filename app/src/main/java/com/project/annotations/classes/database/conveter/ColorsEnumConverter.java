package com.project.annotations.classes.database.conveter;

import androidx.room.TypeConverter;

import com.project.annotations.classes.model.enums.ColorsEnum;


public class ColorsEnumConverter {

    @TypeConverter
    public String colorsEnumToString(ColorsEnum colorsEnum) {
        if (colorsEnum != null) {
            return colorsEnum.name();
        }
        return null;
    }

    @TypeConverter
    public ColorsEnum stringToEnum(String value) {
        if (value != null) {
            return ColorsEnum.valueOf(value);
        }
        return null;
    }
}
