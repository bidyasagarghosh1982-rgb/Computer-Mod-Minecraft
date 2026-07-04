package com.computermod.clock;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneManager {
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public enum TimeZone {
        UTC("UTC", "Coordinated Universal Time"),
        EST("America/New_York", "Eastern Standard Time"),
        PST("America/Los_Angeles", "Pacific Standard Time"),
        CST("America/Chicago", "Central Standard Time"),
        JST("Asia/Tokyo", "Japan Standard Time"),
        CET("Europe/Paris", "Central European Time"),
        IST("Asia/Kolkata", "Indian Standard Time"),
        AEST("Australia/Sydney", "Australian Eastern Standard Time"),
        GMT("Europe/London", "Greenwich Mean Time"),
        NZST("Pacific/Auckland", "New Zealand Standard Time");

        public final String zoneId;
        public final String displayName;

        TimeZone(String zoneId, String displayName) {
            this.zoneId = zoneId;
            this.displayName = displayName;
        }
    }

    public static String getCurrentTimeForZone(TimeZone zone) {
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone.zoneId));
            return TIME_FORMATTER.format(zonedDateTime);
        } catch (Exception e) {
            return "--:--:--";
        }
    }

    public static String getCurrentDateForZone(TimeZone zone) {
        try {
            ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zone.zoneId));
            return DATE_FORMATTER.format(zonedDateTime);
        } catch (Exception e) {
            return "----/--/--";
        }
    }

    public static String getFormattedTimeZoneInfo(TimeZone zone) {
        String time = getCurrentTimeForZone(zone);
        String date = getCurrentDateForZone(zone);
        return zone.displayName + " [" + zone.name() + "]\n" + date + " " + time;
    }
}
