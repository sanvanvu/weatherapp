package com.vuvansan.model;

public class ItemData {
    private  String DataTime;
    private int EpochDataTime;
    private int WeatherIcon;
    private String IconPhrase;
    private Boolean HasPrecipitation,IsDaylight;
    private Temperature Temperature;
    private int PrecipitationProbability;
    private String MobileLink;
    private  String Link;

    public String getDataTime() {
        return DataTime;
    }

    public void setDataTime(String dataTime) {
        DataTime = dataTime;
    }

    public int getEpochDataTime() {
        return EpochDataTime;
    }

    public void setEpochDataTime(int epochDataTime) {
        EpochDataTime = epochDataTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public Boolean getHasPrecipitation() {
        return HasPrecipitation;
    }

    public void setHasPrecipitation(Boolean hasPrecipitation) {
        HasPrecipitation = hasPrecipitation;
    }

    public Boolean getDaylight() {
        return IsDaylight;
    }

    public void setDaylight(Boolean daylight) {
        IsDaylight = daylight;
    }

    public com.vuvansan.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.vuvansan.model.Temperature temperature) {
        Temperature = temperature;
    }

    public int getPrecipitationProbability() {
        return PrecipitationProbability;
    }

    public void setPrecipitationProbability(int precipitationProbability) {
        PrecipitationProbability = precipitationProbability;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public void setMobileLink(String mobileLink) {
        MobileLink = mobileLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
