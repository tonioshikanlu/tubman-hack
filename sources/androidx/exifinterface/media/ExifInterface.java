package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InputDeviceCompat;
import androidx.media.AudioAttributesCompat;
import b.e.a.a.a;
import com.google.android.material.datepicker.UtcDates;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class ExifInterface {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    public static final Charset ASCII;
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final short BYTE_ALIGN_II = 18761;
    public static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    public static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};
    private static final ExifTag[] EXIF_POINTER_TAGS = {new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 1), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 1)};
    public static final ExifTag[][] EXIF_TAGS;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    private static final List<Integer> FLIPPED_ROTATION_ORDER = Arrays.asList(new Integer[]{2, 7, 4, 5});
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    private static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, 49};
    private static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    public static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final ExifTag[] IFD_EXIF_TAGS;
    private static final int IFD_FORMAT_BYTE = 1;
    public static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    public static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final int IFD_OFFSET = 8;
    private static final ExifTag[] IFD_THUMBNAIL_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    public static final int IFD_TYPE_PREVIEW = 5;
    public static final int IFD_TYPE_PRIMARY = 0;
    public static final int IFD_TYPE_THUMBNAIL = 4;
    private static final int IMAGE_TYPE_ARW = 1;
    private static final int IMAGE_TYPE_CR2 = 2;
    private static final int IMAGE_TYPE_DNG = 3;
    private static final int IMAGE_TYPE_HEIF = 12;
    private static final int IMAGE_TYPE_JPEG = 4;
    private static final int IMAGE_TYPE_NEF = 5;
    private static final int IMAGE_TYPE_NRW = 6;
    private static final int IMAGE_TYPE_ORF = 7;
    private static final int IMAGE_TYPE_PEF = 8;
    private static final int IMAGE_TYPE_RAF = 9;
    private static final int IMAGE_TYPE_RW2 = 10;
    private static final int IMAGE_TYPE_SRW = 11;
    private static final int IMAGE_TYPE_UNKNOWN = 0;
    private static final ExifTag JPEG_INTERCHANGE_FORMAT_LENGTH_TAG = new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4);
    private static final ExifTag JPEG_INTERCHANGE_FORMAT_TAG = new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4);
    public static final byte[] JPEG_SIGNATURE = {-1, MARKER_SOI, -1};
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    public static final byte MARKER = -1;
    public static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    public static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOI = -40;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final ExifTag[] ORF_CAMERA_SETTINGS_TAGS;
    private static final ExifTag[] ORF_IMAGE_PROCESSING_TAGS;
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final ExifTag[] ORF_MAKER_NOTE_TAGS;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final String PEF_SIGNATURE = "PENTAX";
    private static final ExifTag[] PEF_TAGS;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int RAF_INFO_SIZE = 160;
    private static final int RAF_JPEG_LENGTH_VALUE_SIZE = 4;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final List<Integer> ROTATION_ORDER = Arrays.asList(new Integer[]{1, 6, 3, 8});
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    public static final byte START_CODE = 42;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    private static final String TAG = "ExifInterface";
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";
    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    private static final String TAG_HAS_THUMBNAIL = "HasThumbnail";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";
    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final ExifTag TAG_RAF_IMAGE_SIZE = new ExifTag(TAG_STRIP_OFFSETS, AudioAttributesCompat.FLAG_ALL_PUBLIC, 3);
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    private static final String TAG_THUMBNAIL_DATA = "ThumbnailData";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";
    private static final String TAG_THUMBNAIL_LENGTH = "ThumbnailLength";
    private static final String TAG_THUMBNAIL_OFFSET = "ThumbnailOffset";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;
    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final HashMap<Integer, Integer> sExifPointerTagMap = new HashMap<>();
    private static final HashMap<Integer, ExifTag>[] sExifTagMapsForReading;
    private static final HashMap<String, ExifTag>[] sExifTagMapsForWriting;
    private static SimpleDateFormat sFormatter;
    private static final Pattern sGpsTimestampPattern = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    private static final Pattern sNonZeroTimePattern = Pattern.compile(".*[1-9].*");
    private static final HashSet<String> sTagSetForCompatibility = new HashSet<>(Arrays.asList(new String[]{TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP}));
    private AssetManager.AssetInputStream mAssetInputStream;
    private final HashMap<String, ExifAttribute>[] mAttributes;
    private Set<Integer> mAttributesOffsets;
    private ByteOrder mExifByteOrder = ByteOrder.BIG_ENDIAN;
    private int mExifOffset;
    private String mFilename;
    private boolean mHasThumbnail;
    private boolean mIsSupportedFile;
    private int mMimeType;
    private boolean mModified;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private int mRw2JpgFromRawOffset;
    private FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;

    public static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;
        private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
        private ByteOrder mByteOrder;
        private DataInputStream mDataInputStream;
        public final int mLength;
        public int mPosition;

        public ByteOrderedDataInputStream(InputStream inputStream) {
            this.mByteOrder = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.mDataInputStream = dataInputStream;
            int available = dataInputStream.available();
            this.mLength = available;
            this.mPosition = 0;
            this.mDataInputStream.mark(available);
        }

        public ByteOrderedDataInputStream(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        public int available() {
            return this.mDataInputStream.available();
        }

        public int getLength() {
            return this.mLength;
        }

        public int peek() {
            return this.mPosition;
        }

        public int read() {
            this.mPosition++;
            return this.mDataInputStream.read();
        }

        public int read(byte[] bArr, int i2, int i3) {
            int read = this.mDataInputStream.read(bArr, i2, i3);
            this.mPosition += read;
            return read;
        }

        public boolean readBoolean() {
            this.mPosition++;
            return this.mDataInputStream.readBoolean();
        }

        public byte readByte() {
            int i2 = this.mPosition + 1;
            this.mPosition = i2;
            if (i2 <= this.mLength) {
                int read = this.mDataInputStream.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.mPosition += 2;
            return this.mDataInputStream.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            int length = this.mPosition + bArr.length;
            this.mPosition = length;
            if (length > this.mLength) {
                throw new EOFException();
            } else if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i2, int i3) {
            int i4 = this.mPosition + i3;
            this.mPosition = i4;
            if (i4 > this.mLength) {
                throw new EOFException();
            } else if (this.mDataInputStream.read(bArr, i2, i3) != i3) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i2 = this.mPosition + 4;
            this.mPosition = i2;
            if (i2 <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                int read3 = this.mDataInputStream.read();
                int read4 = this.mDataInputStream.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder y = a.y("Invalid byte order: ");
                    y.append(this.mByteOrder);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d(ExifInterface.TAG, "Currently unsupported");
            return null;
        }

        public long readLong() {
            int i2 = this.mPosition + 8;
            this.mPosition = i2;
            if (i2 <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                int read3 = this.mDataInputStream.read();
                int read4 = this.mDataInputStream.read();
                int read5 = this.mDataInputStream.read();
                int read6 = this.mDataInputStream.read();
                int read7 = this.mDataInputStream.read();
                int read8 = this.mDataInputStream.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder y = a.y("Invalid byte order: ");
                    y.append(this.mByteOrder);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i2 = this.mPosition + 2;
            this.mPosition = i2;
            if (i2 <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder y = a.y("Invalid byte order: ");
                    y.append(this.mByteOrder);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.mPosition += 2;
            return this.mDataInputStream.readUTF();
        }

        public int readUnsignedByte() {
            this.mPosition++;
            return this.mDataInputStream.readUnsignedByte();
        }

        public long readUnsignedInt() {
            return ((long) readInt()) & 4294967295L;
        }

        public int readUnsignedShort() {
            int i2 = this.mPosition + 2;
            this.mPosition = i2;
            if (i2 <= this.mLength) {
                int read = this.mDataInputStream.read();
                int read2 = this.mDataInputStream.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.mByteOrder;
                    if (byteOrder == LITTLE_ENDIAN) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == BIG_ENDIAN) {
                        return (read << 8) + read2;
                    }
                    StringBuilder y = a.y("Invalid byte order: ");
                    y.append(this.mByteOrder);
                    throw new IOException(y.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public void seek(long j2) {
            int i2 = this.mPosition;
            if (((long) i2) > j2) {
                this.mPosition = 0;
                this.mDataInputStream.reset();
                this.mDataInputStream.mark(this.mLength);
            } else {
                j2 -= (long) i2;
            }
            int i3 = (int) j2;
            if (skipBytes(i3) != i3) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public int skipBytes(int i2) {
            int min = Math.min(i2, this.mLength - this.mPosition);
            int i3 = 0;
            while (i3 < min) {
                i3 += this.mDataInputStream.skipBytes(min - i3);
            }
            this.mPosition += i3;
            return i3;
        }
    }

    public static class ByteOrderedDataOutputStream extends FilterOutputStream {
        private ByteOrder mByteOrder;
        private final OutputStream mOutputStream;

        public ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.mOutputStream = outputStream;
            this.mByteOrder = byteOrder;
        }

        public void setByteOrder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        public void write(byte[] bArr) {
            this.mOutputStream.write(bArr);
        }

        public void write(byte[] bArr, int i2, int i3) {
            this.mOutputStream.write(bArr, i2, i3);
        }

        public void writeByte(int i2) {
            this.mOutputStream.write(i2);
        }

        public void writeInt(int i2) {
            OutputStream outputStream;
            int i3;
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write((i2 >>> 0) & 255);
                this.mOutputStream.write((i2 >>> 8) & 255);
                this.mOutputStream.write((i2 >>> 16) & 255);
                outputStream = this.mOutputStream;
                i3 = i2 >>> 24;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((i2 >>> 24) & 255);
                this.mOutputStream.write((i2 >>> 16) & 255);
                this.mOutputStream.write((i2 >>> 8) & 255);
                outputStream = this.mOutputStream;
                i3 = i2 >>> 0;
            } else {
                return;
            }
            outputStream.write(i3 & 255);
        }

        public void writeShort(short s) {
            OutputStream outputStream;
            int i2;
            ByteOrder byteOrder = this.mByteOrder;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.mOutputStream.write((s >>> 0) & 255);
                outputStream = this.mOutputStream;
                i2 = s >>> 8;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.mOutputStream.write((s >>> 8) & 255);
                outputStream = this.mOutputStream;
                i2 = s >>> 0;
            } else {
                return;
            }
            outputStream.write(i2 & 255);
        }

        public void writeUnsignedInt(long j2) {
            writeInt((int) j2);
        }

        public void writeUnsignedShort(int i2) {
            writeShort((short) i2);
        }
    }

    public static class ExifAttribute {
        public static final long BYTES_OFFSET_UNKNOWN = -1;
        public final byte[] bytes;
        public final long bytesOffset;
        public final int format;
        public final int numberOfComponents;

        public ExifAttribute(int i2, int i3, long j2, byte[] bArr) {
            this.format = i2;
            this.numberOfComponents = i3;
            this.bytesOffset = j2;
            this.bytes = bArr;
        }

        public ExifAttribute(int i2, int i3, byte[] bArr) {
            this(i2, i3, -1, bArr);
        }

        public static ExifAttribute createByte(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes2 = str.getBytes(ExifInterface.ASCII);
                return new ExifAttribute(1, bytes2.length, bytes2);
            }
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static ExifAttribute createDouble(double d, ByteOrder byteOrder) {
            return createDouble(new double[]{d}, byteOrder);
        }

        public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new ExifAttribute(12, dArr.length, wrap.array());
        }

        public static ExifAttribute createSLong(int i2, ByteOrder byteOrder) {
            return createSLong(new int[]{i2}, byteOrder);
        }

        public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new ExifAttribute(9, iArr.length, wrap.array());
        }

        public static ExifAttribute createSRational(Rational rational, ByteOrder byteOrder) {
            return createSRational(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute createSRational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[10] * rationalArr.length)]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(10, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createString(String str) {
            byte[] bytes2 = (str + 0).getBytes(ExifInterface.ASCII);
            return new ExifAttribute(2, bytes2.length, bytes2);
        }

        public static ExifAttribute createULong(long j2, ByteOrder byteOrder) {
            return createULong(new long[]{j2}, byteOrder);
        }

        public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j2 : jArr) {
                wrap.putInt((int) j2);
            }
            return new ExifAttribute(4, jArr.length, wrap.array());
        }

        public static ExifAttribute createURational(Rational rational, ByteOrder byteOrder) {
            return createURational(new Rational[]{rational}, byteOrder);
        }

        public static ExifAttribute createURational(Rational[] rationalArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[5] * rationalArr.length)]);
            wrap.order(byteOrder);
            for (Rational rational : rationalArr) {
                wrap.putInt((int) rational.numerator);
                wrap.putInt((int) rational.denominator);
            }
            return new ExifAttribute(5, rationalArr.length, wrap.array());
        }

        public static ExifAttribute createUShort(int i2, ByteOrder byteOrder) {
            return createUShort(new int[]{i2}, byteOrder);
        }

        public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i2 : iArr) {
                wrap.putShort((short) i2);
            }
            return new ExifAttribute(3, iArr.length, wrap.array());
        }

        public double getDoubleValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (value instanceof String) {
                return Double.parseDouble((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof double[]) {
                    double[] dArr = (double[]) value;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof Rational[]) {
                    Rational[] rationalArr = (Rational[]) value;
                    if (rationalArr.length == 1) {
                        return rationalArr[0].calculate();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int getIntValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (value instanceof String) {
                return Integer.parseInt((String) value);
            } else {
                if (value instanceof long[]) {
                    long[] jArr = (long[]) value;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (value instanceof int[]) {
                    int[] iArr = (int[]) value;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String getStringValue(ByteOrder byteOrder) {
            Object value = getValue(byteOrder);
            if (value == null) {
                return null;
            }
            if (value instanceof String) {
                return (String) value;
            }
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                while (i2 < jArr.length) {
                    sb.append(jArr[i2]);
                    i2++;
                    if (i2 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                while (i2 < iArr.length) {
                    sb.append(iArr[i2]);
                    i2++;
                    if (i2 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                while (i2 < dArr.length) {
                    sb.append(dArr[i2]);
                    i2++;
                    if (i2 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (!(value instanceof Rational[])) {
                return null;
            } else {
                Rational[] rationalArr = (Rational[]) value;
                while (i2 < rationalArr.length) {
                    sb.append(rationalArr[i2].numerator);
                    sb.append('/');
                    sb.append(rationalArr[i2].denominator);
                    i2++;
                    if (i2 != rationalArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x01a3 A[SYNTHETIC, Splitter:B:164:0x01a3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object getValue(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r3 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.<init>((byte[]) r4)     // Catch:{ IOException -> 0x018d, all -> 0x018b }
                r3.setByteOrder(r11)     // Catch:{ IOException -> 0x0189 }
                int r11 = r10.format     // Catch:{ IOException -> 0x0189 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x0148;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x0148;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0189 }
            L_0x0016:
                goto L_0x0180
            L_0x0018:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x001c:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0036:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0189 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0051:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0189 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0189 }
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0076:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x0090:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                androidx.exifinterface.media.ExifInterface$Rational[] r11 = new androidx.exifinterface.media.ExifInterface.Rational[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00aa:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0189 }
                long r8 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0189 }
                androidx.exifinterface.media.ExifInterface$Rational r4 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ IOException -> 0x0189 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00cd:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.readUnsignedInt()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0189 }
            L_0x00e7:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0189 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0189 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0189 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 < r6) goto L_0x011a
                r11 = r5
            L_0x0105:
                byte[] r6 = androidx.exifinterface.media.ExifInterface.EXIF_ASCII_PREFIX     // Catch:{ IOException -> 0x0189 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0189 }
                if (r11 >= r7) goto L_0x0117
                byte[] r7 = r10.bytes     // Catch:{ IOException -> 0x0189 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0189 }
                byte r8 = r6[r11]     // Catch:{ IOException -> 0x0189 }
                if (r7 == r8) goto L_0x0114
                r4 = r5
                goto L_0x0117
            L_0x0114:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0117:
                if (r4 == 0) goto L_0x011a
                int r5 = r6.length     // Catch:{ IOException -> 0x0189 }
            L_0x011a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189 }
                r11.<init>()     // Catch:{ IOException -> 0x0189 }
            L_0x011f:
                int r4 = r10.numberOfComponents     // Catch:{ IOException -> 0x0189 }
                if (r5 >= r4) goto L_0x013b
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x0189 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0189 }
                if (r4 != 0) goto L_0x012a
                goto L_0x013b
            L_0x012a:
                r6 = 32
                if (r4 < r6) goto L_0x0133
                char r4 = (char) r4     // Catch:{ IOException -> 0x0189 }
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
                goto L_0x0138
            L_0x0133:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0189 }
            L_0x0138:
                int r5 = r5 + 1
                goto L_0x011f
            L_0x013b:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0147
            L_0x0143:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0147:
                return r11
            L_0x0148:
                byte[] r11 = r10.bytes     // Catch:{ IOException -> 0x0189 }
                int r6 = r11.length     // Catch:{ IOException -> 0x0189 }
                if (r6 != r4) goto L_0x016e
                byte r6 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r6 < 0) goto L_0x016e
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0189 }
                if (r11 > r4) goto L_0x016e
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0189 }
                byte[] r6 = r10.bytes     // Catch:{ IOException -> 0x0189 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0189 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0189 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x0169 }
                goto L_0x016d
            L_0x0169:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x016d:
                return r11
            L_0x016e:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0189 }
                byte[] r4 = r10.bytes     // Catch:{ IOException -> 0x0189 }
                java.nio.charset.Charset r5 = androidx.exifinterface.media.ExifInterface.ASCII     // Catch:{ IOException -> 0x0189 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0189 }
                r3.close()     // Catch:{ IOException -> 0x017b }
                goto L_0x017f
            L_0x017b:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x017f:
                return r11
            L_0x0180:
                r3.close()     // Catch:{ IOException -> 0x0184 }
                goto L_0x0188
            L_0x0184:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0188:
                return r2
            L_0x0189:
                r11 = move-exception
                goto L_0x018f
            L_0x018b:
                r11 = move-exception
                goto L_0x01a1
            L_0x018d:
                r11 = move-exception
                r3 = r2
            L_0x018f:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x019f }
                if (r3 == 0) goto L_0x019e
                r3.close()     // Catch:{ IOException -> 0x019a }
                goto L_0x019e
            L_0x019a:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x019e:
                return r2
            L_0x019f:
                r11 = move-exception
                r2 = r3
            L_0x01a1:
                if (r2 == 0) goto L_0x01ab
                r2.close()     // Catch:{ IOException -> 0x01a7 }
                goto L_0x01ab
            L_0x01a7:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01ab:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
        }

        public int size() {
            return ExifInterface.IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
        }

        public String toString() {
            StringBuilder y = a.y("(");
            y.append(ExifInterface.IFD_FORMAT_NAMES[this.format]);
            y.append(", data length:");
            return a.o(y, this.bytes.length, ")");
        }
    }

    public static class ExifTag {
        public final String name;
        public final int number;
        public final int primaryFormat;
        public final int secondaryFormat;

        public ExifTag(String str, int i2, int i3) {
            this.name = str;
            this.number = i2;
            this.primaryFormat = i3;
            this.secondaryFormat = -1;
        }

        public ExifTag(String str, int i2, int i3, int i4) {
            this.name = str;
            this.number = i2;
            this.primaryFormat = i3;
            this.secondaryFormat = i4;
        }

        public boolean isFormatCompatible(int i2) {
            int i3;
            int i4 = this.primaryFormat;
            if (i4 == 7 || i2 == 7 || i4 == i2 || (i3 = this.secondaryFormat) == i2) {
                return true;
            }
            if ((i4 == 4 || i3 == 4) && i2 == 3) {
                return true;
            }
            if ((i4 == 9 || i3 == 9) && i2 == 8) {
                return true;
            }
            return (i4 == 12 || i3 == 12) && i2 == 11;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    public static class Rational {
        public final long denominator;
        public final long numerator;

        public Rational(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        public Rational(long j2, long j3) {
            if (j3 == 0) {
                this.numerator = 0;
                this.denominator = 1;
                return;
            }
            this.numerator = j2;
            this.denominator = j3;
        }

        public double calculate() {
            return ((double) this.numerator) / ((double) this.denominator);
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, AudioAttributesCompat.FLAG_ALL_PUBLIC, 3, 4), new ExifTag(TAG_ORIENTATION, 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, 318, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new ExifTag(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new ExifTag(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new ExifTag(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new ExifTag(TAG_RW2_ISO, 23, 3), new ExifTag(TAG_RW2_JPG_FROM_RAW, 46, 7), new ExifTag(TAG_XMP, 700, 1)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(TAG_F_NUMBER, 33437, 5), new ExifTag(TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new ExifTag(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(TAG_OECF, 34856, 7), new ExifTag(TAG_EXIF_VERSION, 36864, 2), new ExifTag(TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new ExifTag(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(TAG_APERTURE_VALUE, 37378, 5), new ExifTag(TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(TAG_SUBJECT_DISTANCE, 37382, 5), new ExifTag(TAG_METERING_MODE, 37383, 3), new ExifTag(TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(TAG_FLASH, 37385, 3), new ExifTag(TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(TAG_SUBJECT_AREA, 37396, 3), new ExifTag(TAG_MAKER_NOTE, 37500, 7), new ExifTag(TAG_USER_COMMENT, 37510, 7), new ExifTag(TAG_SUBSEC_TIME, 37520, 2), new ExifTag(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(TAG_COLOR_SPACE, 40961, 3), new ExifTag(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_RELATED_SOUND_FILE, 40964, 2), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(TAG_FLASH_ENERGY, 41483, 5), new ExifTag(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new ExifTag(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new ExifTag(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new ExifTag(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(TAG_SUBJECT_LOCATION, 41492, 3), new ExifTag(TAG_EXPOSURE_INDEX, 41493, 5), new ExifTag(TAG_SENSING_METHOD, 41495, 3), new ExifTag(TAG_FILE_SOURCE, 41728, 7), new ExifTag(TAG_SCENE_TYPE, 41729, 7), new ExifTag(TAG_CFA_PATTERN, 41730, 7), new ExifTag(TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(TAG_WHITE_BALANCE, 41987, 3), new ExifTag(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new ExifTag(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new ExifTag(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(TAG_GAIN_CONTROL, 41991, 3), new ExifTag(TAG_CONTRAST, 41992, 3), new ExifTag(TAG_SATURATION, 41993, 3), new ExifTag(TAG_SHARPNESS, 41994, 3), new ExifTag(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new ExifTag(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new ExifTag(TAG_IMAGE_UNIQUE_ID, 42016, 2), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(TAG_GPS_VERSION_ID, 0, 1), new ExifTag(TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(TAG_GPS_LATITUDE, 2, 5), new ExifTag(TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(TAG_GPS_LONGITUDE, 4, 5), new ExifTag(TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(TAG_GPS_ALTITUDE, 6, 5), new ExifTag(TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(TAG_GPS_SATELLITES, 8, 2), new ExifTag(TAG_GPS_STATUS, 9, 2), new ExifTag(TAG_GPS_MEASURE_MODE, 10, 2), new ExifTag(TAG_GPS_DOP, 11, 5), new ExifTag(TAG_GPS_SPEED_REF, 12, 2), new ExifTag(TAG_GPS_SPEED, 13, 5), new ExifTag(TAG_GPS_TRACK_REF, 14, 2), new ExifTag(TAG_GPS_TRACK, 15, 5), new ExifTag(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(TAG_GPS_IMG_DIRECTION, 17, 5), new ExifTag(TAG_GPS_MAP_DATUM, 18, 2), new ExifTag(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new ExifTag(TAG_GPS_DEST_LATITUDE, 20, 5), new ExifTag(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new ExifTag(TAG_GPS_DEST_LONGITUDE, 22, 5), new ExifTag(TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(TAG_GPS_DEST_BEARING, 24, 5), new ExifTag(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new ExifTag(TAG_GPS_DEST_DISTANCE, 26, 5), new ExifTag(TAG_GPS_PROCESSING_METHOD, 27, 7), new ExifTag(TAG_GPS_AREA_INFORMATION, 28, 7), new ExifTag(TAG_GPS_DATESTAMP, 29, 2), new ExifTag(TAG_GPS_DIFFERENTIAL, 30, 3)};
        IFD_GPS_TAGS = exifTagArr3;
        ExifTag[] exifTagArr4 = {new ExifTag(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        ExifTag[] exifTagArr5 = {new ExifTag(TAG_NEW_SUBFILE_TYPE, 254, 4), new ExifTag(TAG_SUBFILE_TYPE, 255, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new ExifTag(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new ExifTag(TAG_BITS_PER_SAMPLE, 258, 3), new ExifTag(TAG_COMPRESSION, 259, 3), new ExifTag(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new ExifTag(TAG_IMAGE_DESCRIPTION, 270, 2), new ExifTag(TAG_MAKE, 271, 2), new ExifTag(TAG_MODEL, 272, 2), new ExifTag(TAG_STRIP_OFFSETS, AudioAttributesCompat.FLAG_ALL_PUBLIC, 3, 4), new ExifTag(TAG_THUMBNAIL_ORIENTATION, 274, 3), new ExifTag(TAG_SAMPLES_PER_PIXEL, 277, 3), new ExifTag(TAG_ROWS_PER_STRIP, 278, 3, 4), new ExifTag(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new ExifTag(TAG_X_RESOLUTION, 282, 5), new ExifTag(TAG_Y_RESOLUTION, 283, 5), new ExifTag(TAG_PLANAR_CONFIGURATION, 284, 3), new ExifTag(TAG_RESOLUTION_UNIT, 296, 3), new ExifTag(TAG_TRANSFER_FUNCTION, 301, 3), new ExifTag(TAG_SOFTWARE, 305, 2), new ExifTag(TAG_DATETIME, 306, 2), new ExifTag(TAG_ARTIST, 315, 2), new ExifTag(TAG_WHITE_POINT, 318, 5), new ExifTag(TAG_PRIMARY_CHROMATICITIES, 319, 5), new ExifTag(TAG_SUB_IFD_POINTER, 330, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT, InputDeviceCompat.SOURCE_DPAD, 4), new ExifTag(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new ExifTag(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new ExifTag(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new ExifTag(TAG_Y_CB_CR_POSITIONING, 531, 3), new ExifTag(TAG_REFERENCE_BLACK_WHITE, 532, 5), new ExifTag(TAG_COPYRIGHT, 33432, 2), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_DNG_VERSION, 50706, 1), new ExifTag(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = exifTagArr5;
        ExifTag[] exifTagArr6 = {new ExifTag(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new ExifTag(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 4), new ExifTag(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 4)};
        ORF_MAKER_NOTE_TAGS = exifTagArr6;
        ExifTag[] exifTagArr7 = {new ExifTag(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new ExifTag(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        ORF_CAMERA_SETTINGS_TAGS = exifTagArr7;
        ExifTag[] exifTagArr8 = {new ExifTag(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = exifTagArr8;
        ExifTag[] exifTagArr9 = {new ExifTag(TAG_COLOR_SPACE, 55, 3)};
        PEF_TAGS = exifTagArr9;
        ExifTag[][] exifTagArr10 = {exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4, exifTagArr5, exifTagArr, exifTagArr6, exifTagArr7, exifTagArr8, exifTagArr9};
        EXIF_TAGS = exifTagArr10;
        sExifTagMapsForReading = new HashMap[exifTagArr10.length];
        sExifTagMapsForWriting = new HashMap[exifTagArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        ASCII = forName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(forName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        sFormatter = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        int i2 = 0;
        while (true) {
            ExifTag[][] exifTagArr11 = EXIF_TAGS;
            if (i2 < exifTagArr11.length) {
                sExifTagMapsForReading[i2] = new HashMap<>();
                sExifTagMapsForWriting[i2] = new HashMap<>();
                for (ExifTag exifTag : exifTagArr11[i2]) {
                    sExifTagMapsForReading[i2].put(Integer.valueOf(exifTag.number), exifTag);
                    sExifTagMapsForWriting[i2].put(exifTag.name, exifTag);
                }
                i2++;
            } else {
                HashMap<Integer, Integer> hashMap = sExifPointerTagMap;
                ExifTag[] exifTagArr12 = EXIF_POINTER_TAGS;
                hashMap.put(Integer.valueOf(exifTagArr12[0].number), 5);
                hashMap.put(Integer.valueOf(exifTagArr12[1].number), 1);
                hashMap.put(Integer.valueOf(exifTagArr12[2].number), 2);
                hashMap.put(Integer.valueOf(exifTagArr12[3].number), 3);
                hashMap.put(Integer.valueOf(exifTagArr12[4].number), 7);
                hashMap.put(Integer.valueOf(exifTagArr12[5].number), 8);
                return;
            }
        }
    }

    public ExifInterface(@NonNull File file) {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        Objects.requireNonNull(file, "file cannot be null");
        initForFilename(file.getAbsolutePath());
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExifInterface(@androidx.annotation.NonNull java.io.FileDescriptor r5) {
        /*
            r4 = this;
            r4.<init>()
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r0 = EXIF_TAGS
            int r1 = r0.length
            java.util.HashMap[] r1 = new java.util.HashMap[r1]
            r4.mAttributes = r1
            java.util.HashSet r1 = new java.util.HashSet
            int r0 = r0.length
            r1.<init>(r0)
            r4.mAttributesOffsets = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r4.mExifByteOrder = r0
            java.lang.String r0 = "fileDescriptor cannot be null"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            r4.mAssetInputStream = r0
            r4.mFilename = r0
            r1 = 0
            boolean r2 = isSeekableFD(r5)
            if (r2 == 0) goto L_0x0038
            r4.mSeekableFileDescriptor = r5
            java.io.FileDescriptor r5 = android.system.Os.dup(r5)     // Catch:{ Exception -> 0x002f }
            r1 = 1
            goto L_0x003a
        L_0x002f:
            r5 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Failed to duplicate file descriptor"
            r0.<init>(r1, r5)
            throw r0
        L_0x0038:
            r4.mSeekableFileDescriptor = r0
        L_0x003a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x004d }
            r2.<init>(r5)     // Catch:{ all -> 0x004d }
            r4.loadAttributes(r2)     // Catch:{ all -> 0x004b }
            closeQuietly(r2)
            if (r1 == 0) goto L_0x004a
            closeFileDescriptor(r5)
        L_0x004a:
            return
        L_0x004b:
            r0 = move-exception
            goto L_0x0051
        L_0x004d:
            r2 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x0051:
            closeQuietly(r2)
            if (r1 == 0) goto L_0x0059
            closeFileDescriptor(r5)
        L_0x0059:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.<init>(java.io.FileDescriptor):void");
    }

    public ExifInterface(@NonNull InputStream inputStream) {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        FileDescriptor fileDescriptor = null;
        this.mFilename = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.mAssetInputStream = (AssetManager.AssetInputStream) inputStream;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (isSeekableFD(fileInputStream.getFD())) {
                    this.mAssetInputStream = null;
                    fileDescriptor = fileInputStream.getFD();
                }
            }
            this.mAssetInputStream = null;
        }
        this.mSeekableFileDescriptor = fileDescriptor;
        loadAttributes(inputStream);
    }

    public ExifInterface(@NonNull String str) {
        ExifTag[][] exifTagArr = EXIF_TAGS;
        this.mAttributes = new HashMap[exifTagArr.length];
        this.mAttributesOffsets = new HashSet(exifTagArr.length);
        Objects.requireNonNull(str, "filename cannot be null");
        initForFilename(str);
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.mAttributes[0].put(TAG_DATETIME, ExifAttribute.createString(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.mAttributes[1].put(TAG_LIGHT_SOURCE, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
    }

    private static void closeFileDescriptor(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Log.e(TAG, "Error closing fd.");
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private String convertDecimalDegree(double d) {
        long j2 = (long) d;
        double d2 = d - ((double) j2);
        long j3 = (long) (d2 * 60.0d);
        long round = Math.round((d2 - (((double) j3) / 60.0d)) * 3600.0d * 1.0E7d);
        return j2 + "/1," + j3 + "/1," + round + "/10000000";
    }

    private static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble2 = ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + parseDouble;
            if (!str2.equals(LATITUDE_SOUTH)) {
                if (!str2.equals(LONGITUDE_WEST)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals(LONGITUDE_EAST)) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble2;
                }
            }
            return -parseDouble2;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private static long[] convertToLongArray(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                jArr[i2] = (long) iArr[i2];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i2;
            }
            i2 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    @Nullable
    private ExifAttribute getExifAttribute(@NonNull String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            if (DEBUG) {
                Log.d(TAG, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            ExifAttribute exifAttribute = this.mAttributes[i2].get(str);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    private void getHeifAttributes(final ByteOrderedDataInputStream byteOrderedDataInputStream) {
        String str;
        String str2;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new MediaDataSource() {
                public long mPosition;

                public void close() {
                }

                public long getSize() {
                    return -1;
                }

                public int readAt(long j2, byte[] bArr, int i2, int i3) {
                    if (i3 == 0) {
                        return 0;
                    }
                    if (j2 < 0) {
                        return -1;
                    }
                    try {
                        long j3 = this.mPosition;
                        if (j3 != j2) {
                            if (j3 >= 0 && j2 >= j3 + ((long) byteOrderedDataInputStream.available())) {
                                return -1;
                            }
                            byteOrderedDataInputStream.seek(j2);
                            this.mPosition = j2;
                        }
                        if (i3 > byteOrderedDataInputStream.available()) {
                            i3 = byteOrderedDataInputStream.available();
                        }
                        int read = byteOrderedDataInputStream.read(bArr, i2, i3);
                        if (read >= 0) {
                            this.mPosition += (long) read;
                            return read;
                        }
                    } catch (IOException unused) {
                    }
                    this.mPosition = -1;
                    return -1;
                }
            });
            String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
            String str3 = null;
            if ("yes".equals(extractMetadata3)) {
                str3 = mediaMetadataRetriever.extractMetadata(29);
                str2 = mediaMetadataRetriever.extractMetadata(30);
                str = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(extractMetadata4)) {
                str3 = mediaMetadataRetriever.extractMetadata(18);
                str2 = mediaMetadataRetriever.extractMetadata(19);
                str = mediaMetadataRetriever.extractMetadata(24);
            } else {
                str2 = null;
                str = null;
            }
            if (str3 != null) {
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, ExifAttribute.createUShort(Integer.parseInt(str3), this.mExifByteOrder));
            }
            if (str2 != null) {
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, ExifAttribute.createUShort(Integer.parseInt(str2), this.mExifByteOrder));
            }
            if (str != null) {
                int i2 = 1;
                int parseInt = Integer.parseInt(str);
                if (parseInt == 90) {
                    i2 = 6;
                } else if (parseInt == 180) {
                    i2 = 3;
                } else if (parseInt == 270) {
                    i2 = 8;
                }
                this.mAttributes[0].put(TAG_ORIENTATION, ExifAttribute.createUShort(i2, this.mExifByteOrder));
            }
            if (!(extractMetadata == null || extractMetadata2 == null)) {
                int parseInt2 = Integer.parseInt(extractMetadata);
                int parseInt3 = Integer.parseInt(extractMetadata2);
                if (parseInt3 > 6) {
                    byteOrderedDataInputStream.seek((long) parseInt2);
                    byte[] bArr = new byte[6];
                    if (byteOrderedDataInputStream.read(bArr) == 6) {
                        int i3 = parseInt3 - 6;
                        if (Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                            byte[] bArr2 = new byte[i3];
                            if (byteOrderedDataInputStream.read(bArr2) == i3) {
                                readExifSegment(bArr2, 0);
                            } else {
                                throw new IOException("Can't read exif");
                            }
                        } else {
                            throw new IOException("Invalid identifier");
                        }
                    } else {
                        throw new IOException("Can't read identifier");
                    }
                } else {
                    throw new IOException("Invalid exif length");
                }
            }
            if (DEBUG) {
                Log.d(TAG, "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ea A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getJpegAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r21, int r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            boolean r4 = DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0022
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "getJpegAttributes starting with: "
            r4.append(r6)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0022:
            java.nio.ByteOrder r4 = java.nio.ByteOrder.BIG_ENDIAN
            r1.setByteOrder(r4)
            long r6 = (long) r2
            r1.seek(r6)
            byte r4 = r21.readByte()
            java.lang.String r6 = "Invalid marker: "
            r7 = -1
            if (r4 != r7) goto L_0x01c6
            r8 = 1
            int r2 = r2 + r8
            byte r9 = r21.readByte()
            r10 = -40
            if (r9 != r10) goto L_0x01af
            int r2 = r2 + r8
        L_0x003f:
            byte r4 = r21.readByte()
            if (r4 != r7) goto L_0x0196
            int r2 = r2 + r8
            byte r4 = r21.readByte()
            boolean r6 = DEBUG
            if (r6 == 0) goto L_0x0064
            java.lang.String r9 = "Found JPEG segment indicator: "
            java.lang.StringBuilder r9 = b.e.a.a.a.y(r9)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L_0x0064:
            int r2 = r2 + r8
            r9 = -39
            if (r4 == r9) goto L_0x0190
            r9 = -38
            if (r4 != r9) goto L_0x006f
            goto L_0x0190
        L_0x006f:
            int r9 = r21.readUnsignedShort()
            int r9 = r9 + -2
            int r2 = r2 + 2
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = "JPEG segment: "
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            r10 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r10 = java.lang.Integer.toHexString(r10)
            r6.append(r10)
            java.lang.String r10 = " (length: "
            r6.append(r10)
            int r10 = r9 + 2
            r6.append(r10)
            java.lang.String r10 = ")"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x009e:
            java.lang.String r6 = "Invalid length"
            if (r9 < 0) goto L_0x018a
            r10 = -31
            r11 = 0
            if (r4 == r10) goto L_0x00f2
            r10 = -2
            if (r4 == r10) goto L_0x0146
            switch(r4) {
                case -64: goto L_0x00b8;
                case -63: goto L_0x00b8;
                case -62: goto L_0x00b8;
                case -61: goto L_0x00b8;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r4) {
                case -59: goto L_0x00b8;
                case -58: goto L_0x00b8;
                case -57: goto L_0x00b8;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r4) {
                case -55: goto L_0x00b8;
                case -54: goto L_0x00b8;
                case -53: goto L_0x00b8;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            switch(r4) {
                case -51: goto L_0x00b8;
                case -50: goto L_0x00b8;
                case -49: goto L_0x00b8;
                default: goto L_0x00b6;
            }
        L_0x00b6:
            goto L_0x0169
        L_0x00b8:
            int r4 = r1.skipBytes(r8)
            if (r4 != r8) goto L_0x00ea
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r3]
            int r10 = r21.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r10, (java.nio.ByteOrder) r12)
            java.lang.String r11 = "ImageLength"
            r4.put(r11, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r3]
            int r10 = r21.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r10, (java.nio.ByteOrder) r12)
            java.lang.String r11 = "ImageWidth"
            r4.put(r11, r10)
            int r9 = r9 + -5
            goto L_0x0169
        L_0x00ea:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid SOFx"
            r1.<init>(r2)
            throw r1
        L_0x00f2:
            byte[] r4 = new byte[r9]
            r1.readFully(r4)
            int r10 = r2 + r9
            byte[] r12 = IDENTIFIER_EXIF_APP1
            boolean r13 = startsWith(r4, r12)
            if (r13 == 0) goto L_0x0110
            int r13 = r12.length
            int r2 = r2 + r13
            long r13 = (long) r2
            int r2 = r12.length
            byte[] r2 = java.util.Arrays.copyOfRange(r4, r2, r9)
            r0.readExifSegment(r2, r3)
            int r2 = (int) r13
            r0.mExifOffset = r2
            goto L_0x0144
        L_0x0110:
            byte[] r12 = IDENTIFIER_XMP_APP1
            boolean r13 = startsWith(r4, r12)
            if (r13 == 0) goto L_0x0144
            int r13 = r12.length
            int r2 = r2 + r13
            long r14 = (long) r2
            int r2 = r12.length
            byte[] r2 = java.util.Arrays.copyOfRange(r4, r2, r9)
            java.lang.String r4 = "Xmp"
            java.lang.String r9 = r0.getAttribute(r4)
            if (r9 != 0) goto L_0x0144
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r9 = r0.mAttributes
            r9 = r9[r11]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r12 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            r16 = 1
            int r13 = r2.length
            r17 = r13
            r13 = r12
            r18 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r18 = r2
            r13.<init>(r14, r15, r16, r18)
            r9.put(r4, r12)
        L_0x0144:
            r2 = r10
            r9 = r11
        L_0x0146:
            byte[] r4 = new byte[r9]
            int r10 = r1.read(r4)
            if (r10 != r9) goto L_0x0182
            java.lang.String r9 = "UserComment"
            java.lang.String r10 = r0.getAttribute(r9)
            if (r10 != 0) goto L_0x0168
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r8]
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = ASCII
            r12.<init>(r4, r13)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r4 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r12)
            r10.put(r9, r4)
        L_0x0168:
            r9 = r11
        L_0x0169:
            if (r9 < 0) goto L_0x017c
            int r4 = r1.skipBytes(r9)
            if (r4 != r9) goto L_0x0174
            int r2 = r2 + r9
            goto L_0x003f
        L_0x0174:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid JPEG segment"
            r1.<init>(r2)
            throw r1
        L_0x017c:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0182:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid exif"
            r1.<init>(r2)
            throw r1
        L_0x018a:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r6)
            throw r1
        L_0x0190:
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            r1.setByteOrder(r2)
            return
        L_0x0196:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Invalid marker:"
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r2)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01af:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c6:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = b.e.a.a.a.y(r6)
            r3 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getJpegAttributes(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int, int):void");
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(SIGNATURE_CHECK_SIZE);
        byte[] bArr = new byte[SIGNATURE_CHECK_SIZE];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        if (isHeifFormat(bArr)) {
            return 12;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        return isRw2Format(bArr) ? 10 : 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getOrfAttributes(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r7) {
        /*
            r6 = this;
            r6.getRawAttributes(r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto L_0x00f0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r1 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream
            byte[] r7 = r7.bytes
            r1.<init>((byte[]) r7)
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            r1.setByteOrder(r7)
            byte[] r7 = ORF_MAKER_NOTE_HEADER_1
            int r2 = r7.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            r3 = 0
            r1.seek(r3)
            byte[] r3 = ORF_MAKER_NOTE_HEADER_2
            int r4 = r3.length
            byte[] r4 = new byte[r4]
            r1.readFully(r4)
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x003c
            r2 = 8
            goto L_0x0044
        L_0x003c:
            boolean r7 = java.util.Arrays.equals(r4, r3)
            if (r7 == 0) goto L_0x0047
            r2 = 12
        L_0x0044:
            r1.seek(r2)
        L_0x0047:
            r7 = 6
            r6.readImageFileDirectory(r1, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r1 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r1
            if (r7 == 0) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r6.mAttributes
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x007b:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r7
            if (r7 == 0) goto L_0x00f0
            java.nio.ByteOrder r1 = r6.mExifByteOrder
            java.lang.Object r7 = r7.getValue(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00da
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009a
            goto L_0x00da
        L_0x009a:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f0
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f0
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00bb
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00bb:
            java.nio.ByteOrder r7 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort((int) r1, (java.nio.ByteOrder) r7)
            java.nio.ByteOrder r0 = r6.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort((int) r2, (java.nio.ByteOrder) r0)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r1 = r6.mAttributes
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r6.mAttributes
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f0
        L_0x00da:
            java.lang.String r0 = "Invalid aspect frame values. frame="
            java.lang.StringBuilder r0 = b.e.a.a.a.y(r0)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getOrfAttributes(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream):void");
    }

    private void getRafAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        byteOrderedDataInputStream.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byteOrderedDataInputStream.read(bArr);
        byteOrderedDataInputStream.skipBytes(4);
        byteOrderedDataInputStream.read(bArr2);
        int i2 = ByteBuffer.wrap(bArr).getInt();
        int i3 = ByteBuffer.wrap(bArr2).getInt();
        getJpegAttributes(byteOrderedDataInputStream, i2, 5);
        byteOrderedDataInputStream.seek((long) i3);
        byteOrderedDataInputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
        int readInt = byteOrderedDataInputStream.readInt();
        if (DEBUG) {
            Log.d(TAG, "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
            int readUnsignedShort2 = byteOrderedDataInputStream.readUnsignedShort();
            if (readUnsignedShort == TAG_RAF_IMAGE_SIZE.number) {
                short readShort = byteOrderedDataInputStream.readShort();
                short readShort2 = byteOrderedDataInputStream.readShort();
                ExifAttribute createUShort = ExifAttribute.createUShort((int) readShort, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort((int) readShort2, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, createUShort);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, createUShort2);
                if (DEBUG) {
                    Log.d(TAG, "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            byteOrderedDataInputStream.skipBytes(readUnsignedShort2);
        }
    }

    private void getRawAttributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        ExifAttribute exifAttribute;
        parseTiffHeaders(byteOrderedDataInputStream, byteOrderedDataInputStream.available());
        readImageFileDirectory(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 0);
        updateImageSizeValues(byteOrderedDataInputStream, 5);
        updateImageSizeValues(byteOrderedDataInputStream, 4);
        validateImages(byteOrderedDataInputStream);
        if (this.mMimeType == 8 && (exifAttribute = this.mAttributes[1].get(TAG_MAKER_NOTE)) != null) {
            ByteOrderedDataInputStream byteOrderedDataInputStream2 = new ByteOrderedDataInputStream(exifAttribute.bytes);
            byteOrderedDataInputStream2.setByteOrder(this.mExifByteOrder);
            byteOrderedDataInputStream2.seek(6);
            readImageFileDirectory(byteOrderedDataInputStream2, 9);
            ExifAttribute exifAttribute2 = this.mAttributes[9].get(TAG_COLOR_SPACE);
            if (exifAttribute2 != null) {
                this.mAttributes[1].put(TAG_COLOR_SPACE, exifAttribute2);
            }
        }
    }

    private void getRw2Attributes(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        getRawAttributes(byteOrderedDataInputStream);
        if (this.mAttributes[0].get(TAG_RW2_JPG_FROM_RAW) != null) {
            getJpegAttributes(byteOrderedDataInputStream, this.mRw2JpgFromRawOffset, 5);
        }
        ExifAttribute exifAttribute = this.mAttributes[0].get(TAG_RW2_ISO);
        ExifAttribute exifAttribute2 = this.mAttributes[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (exifAttribute != null && exifAttribute2 == null) {
            this.mAttributes[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, exifAttribute);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> guessDataFormat(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = guessDataFormat(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = guessDataFormat(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r12 < 0) goto L_0x00f5
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r12 > 0) goto L_0x00eb
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            r2 = 4
            if (r1 < 0) goto L_0x0130
            long r3 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.guessDataFormat(java.lang.String):android.util.Pair");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r4, java.util.HashMap r5) {
        /*
            r3 = this;
            java.lang.String r0 = "JPEGInterchangeFormat"
            java.lang.Object r0 = r5.get(r0)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r0 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r0
            java.lang.String r1 = "JPEGInterchangeFormatLength"
            java.lang.Object r5 = r5.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = (androidx.exifinterface.media.ExifInterface.ExifAttribute) r5
            if (r0 == 0) goto L_0x0084
            if (r5 == 0) goto L_0x0084
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r0 = r0.getIntValue(r1)
            java.nio.ByteOrder r1 = r3.mExifByteOrder
            int r5 = r5.getIntValue(r1)
            int r1 = r4.getLength()
            int r1 = r1 - r0
            int r5 = java.lang.Math.min(r5, r1)
            int r1 = r3.mMimeType
            r2 = 4
            if (r1 == r2) goto L_0x003d
            r2 = 9
            if (r1 == r2) goto L_0x003d
            r2 = 10
            if (r1 != r2) goto L_0x0037
            goto L_0x003d
        L_0x0037:
            r2 = 7
            if (r1 != r2) goto L_0x0040
            int r1 = r3.mOrfMakerNoteOffset
            goto L_0x003f
        L_0x003d:
            int r1 = r3.mExifOffset
        L_0x003f:
            int r0 = r0 + r1
        L_0x0040:
            boolean r1 = DEBUG
            if (r1 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting thumbnail attributes with offset: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = ", length: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ExifInterface"
            android.util.Log.d(r2, r1)
        L_0x0062:
            if (r0 <= 0) goto L_0x0084
            if (r5 <= 0) goto L_0x0084
            r1 = 1
            r3.mHasThumbnail = r1
            r3.mThumbnailOffset = r0
            r3.mThumbnailLength = r5
            java.lang.String r1 = r3.mFilename
            if (r1 != 0) goto L_0x0084
            android.content.res.AssetManager$AssetInputStream r1 = r3.mAssetInputStream
            if (r1 != 0) goto L_0x0084
            java.io.FileDescriptor r1 = r3.mSeekableFileDescriptor
            if (r1 != 0) goto L_0x0084
            byte[] r5 = new byte[r5]
            long r0 = (long) r0
            r4.seek(r0)
            r4.readFully(r5)
            r3.mThumbnailBytes = r5
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.handleThumbnailFromJfif(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, java.util.HashMap):void");
    }

    private void handleThumbnailFromStrips(ByteOrderedDataInputStream byteOrderedDataInputStream, HashMap hashMap) {
        String str;
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get(TAG_STRIP_OFFSETS);
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_STRIP_BYTE_COUNTS);
        if (exifAttribute != null && exifAttribute2 != null) {
            long[] convertToLongArray = convertToLongArray(exifAttribute.getValue(this.mExifByteOrder));
            long[] convertToLongArray2 = convertToLongArray(exifAttribute2.getValue(this.mExifByteOrder));
            if (convertToLongArray == null) {
                str = "stripOffsets should not be null.";
            } else if (convertToLongArray2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j2 = 0;
                for (long j3 : convertToLongArray2) {
                    j2 += j3;
                }
                int i2 = (int) j2;
                byte[] bArr = new byte[i2];
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < convertToLongArray.length; i5++) {
                    int i6 = (int) convertToLongArray2[i5];
                    int i7 = ((int) convertToLongArray[i5]) - i3;
                    if (i7 < 0) {
                        Log.d(TAG, "Invalid strip offset value");
                    }
                    byteOrderedDataInputStream.seek((long) i7);
                    int i8 = i3 + i7;
                    byte[] bArr2 = new byte[i6];
                    byteOrderedDataInputStream.read(bArr2);
                    i3 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i4, i6);
                    i4 += i6;
                }
                this.mHasThumbnail = true;
                this.mThumbnailBytes = bArr;
                this.mThumbnailLength = i2;
                return;
            }
            Log.w(TAG, str);
        }
    }

    private void initForFilename(String str) {
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream = null;
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.mSeekableFileDescriptor = fileInputStream2.getFD();
                } else {
                    this.mSeekableFileDescriptor = null;
                }
                loadAttributes(fileInputStream2);
                closeQuietly(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(fileInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0097 A[Catch:{ all -> 0x0090 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isHeifFormat(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream r2 = new androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream     // Catch:{ Exception -> 0x0092 }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x0092 }
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r2.setByteOrder(r1)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            long r3 = (long) r1     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r2.read(r5)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            byte[] r6 = HEIF_TYPE_FTYP     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r5 != 0) goto L_0x0023
            r2.close()
            return r0
        L_0x0023:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 16
            r10 = 8
            if (r7 != 0) goto L_0x0039
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x003a
            r2.close()
            return r0
        L_0x0039:
            r8 = r10
        L_0x003a:
            int r7 = r15.length     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            long r12 = (long) r7     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0042
            int r15 = r15.length     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            long r3 = (long) r15
        L_0x0042:
            long r3 = r3 - r8
            int r15 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x004b
            r2.close()
            return r0
        L_0x004b:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r7 = 0
            r9 = r0
            r10 = r9
        L_0x0051:
            r11 = 4
            long r11 = r3 / r11
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0086
            int r11 = r2.read(r15)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r11 == r1) goto L_0x0063
            r2.close()
            return r0
        L_0x0063:
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0068
            goto L_0x0084
        L_0x0068:
            byte[] r11 = HEIF_BRAND_MIF1     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r12 = 1
            if (r11 == 0) goto L_0x0073
            r9 = r12
            goto L_0x007c
        L_0x0073:
            byte[] r11 = HEIF_BRAND_HEIC     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            boolean r11 = java.util.Arrays.equals(r15, r11)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            if (r11 == 0) goto L_0x007c
            r10 = r12
        L_0x007c:
            if (r9 == 0) goto L_0x0084
            if (r10 == 0) goto L_0x0084
            r2.close()
            return r12
        L_0x0084:
            long r7 = r7 + r5
            goto L_0x0051
        L_0x0086:
            r2.close()
            goto L_0x00a3
        L_0x008a:
            r15 = move-exception
            r1 = r2
            goto L_0x00a4
        L_0x008d:
            r15 = move-exception
            r1 = r2
            goto L_0x0093
        L_0x0090:
            r15 = move-exception
            goto L_0x00a4
        L_0x0092:
            r15 = move-exception
        L_0x0093:
            boolean r2 = DEBUG     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x009e
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x0090 }
        L_0x009e:
            if (r1 == 0) goto L_0x00a3
            r1.close()
        L_0x00a3:
            return r0
        L_0x00a4:
            if (r1 == 0) goto L_0x00a9
            r1.close()
        L_0x00a9:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.isHeifFormat(byte[]):boolean");
    }

    private static boolean isJpegFormat(byte[] bArr) {
        int i2 = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private boolean isOrfFormat(byte[] bArr) {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        short readShort = byteOrderedDataInputStream.readShort();
        byteOrderedDataInputStream.close();
        return readShort == 20306 || readShort == 21330;
    }

    private boolean isRafFormat(byte[] bArr) {
        byte[] bytes = RAF_SIGNATURE.getBytes(Charset.defaultCharset());
        for (int i2 = 0; i2 < bytes.length; i2++) {
            if (bArr[i2] != bytes[i2]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRw2Format(byte[] bArr) {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        short readShort = byteOrderedDataInputStream.readShort();
        byteOrderedDataInputStream.close();
        return readShort == 85;
    }

    private static boolean isSeekableFD(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isSupportedDataType(HashMap hashMap) {
        ExifAttribute exifAttribute;
        int intValue;
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_BITS_PER_SAMPLE);
        if (exifAttribute2 != null) {
            int[] iArr = (int[]) exifAttribute2.getValue(this.mExifByteOrder);
            int[] iArr2 = BITS_PER_SAMPLE_RGB;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.mMimeType == 3 && (exifAttribute = (ExifAttribute) hashMap.get(TAG_PHOTOMETRIC_INTERPRETATION)) != null && (((intValue = exifAttribute.getIntValue(this.mExifByteOrder)) == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (intValue == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!DEBUG) {
            return false;
        }
        Log.d(TAG, "Unsupported data type value");
        return false;
    }

    private boolean isThumbnail(HashMap hashMap) {
        ExifAttribute exifAttribute = (ExifAttribute) hashMap.get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute2 = (ExifAttribute) hashMap.get(TAG_IMAGE_WIDTH);
        if (exifAttribute == null || exifAttribute2 == null) {
            return false;
        }
        return exifAttribute.getIntValue(this.mExifByteOrder) <= 512 && exifAttribute2.getIntValue(this.mExifByteOrder) <= 512;
    }

    private void loadAttributes(@NonNull InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        int i2 = 0;
        while (i2 < EXIF_TAGS.length) {
            try {
                this.mAttributes[i2] = new HashMap<>();
                i2++;
            } catch (IOException e2) {
                this.mIsSupportedFile = false;
                boolean z = DEBUG;
                if (z) {
                    Log.w(TAG, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                addDefaultValuesForCompatibility();
                if (!z) {
                    return;
                }
            } catch (Throwable th) {
                addDefaultValuesForCompatibility();
                if (DEBUG) {
                    printAttributes();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, SIGNATURE_CHECK_SIZE);
        this.mMimeType = getMimeType(bufferedInputStream);
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream((InputStream) bufferedInputStream);
        switch (this.mMimeType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                getRawAttributes(byteOrderedDataInputStream);
                break;
            case 4:
                getJpegAttributes(byteOrderedDataInputStream, 0, 0);
                break;
            case 7:
                getOrfAttributes(byteOrderedDataInputStream);
                break;
            case 9:
                getRafAttributes(byteOrderedDataInputStream);
                break;
            case 10:
                getRw2Attributes(byteOrderedDataInputStream);
                break;
            case 12:
                getHeifAttributes(byteOrderedDataInputStream);
                break;
        }
        setThumbnailData(byteOrderedDataInputStream);
        this.mIsSupportedFile = true;
        addDefaultValuesForCompatibility();
        if (!DEBUG) {
            return;
        }
        printAttributes();
    }

    private static long parseDateTime(@Nullable String str, @Nullable String str2) {
        if (str != null && sNonZeroTimePattern.matcher(str).matches()) {
            try {
                Date parse = sFormatter.parse(str, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                long time = parse.getTime();
                if (str2 == null) {
                    return time;
                }
                try {
                    long parseLong = Long.parseLong(str2);
                    while (parseLong > 1000) {
                        parseLong /= 10;
                    }
                    return time + parseLong;
                } catch (NumberFormatException unused) {
                    return time;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1;
    }

    private void parseTiffHeaders(ByteOrderedDataInputStream byteOrderedDataInputStream, int i2) {
        ByteOrder readByteOrder = readByteOrder(byteOrderedDataInputStream);
        this.mExifByteOrder = readByteOrder;
        byteOrderedDataInputStream.setByteOrder(readByteOrder);
        int readUnsignedShort = byteOrderedDataInputStream.readUnsignedShort();
        int i3 = this.mMimeType;
        if (i3 == 7 || i3 == 10 || readUnsignedShort == 42) {
            int readInt = byteOrderedDataInputStream.readInt();
            if (readInt < 8 || readInt >= i2) {
                throw new IOException(a.g("Invalid first Ifd offset: ", readInt));
            }
            int i4 = readInt - 8;
            if (i4 > 0 && byteOrderedDataInputStream.skipBytes(i4) != i4) {
                throw new IOException(a.g("Couldn't jump to first Ifd: ", i4));
            }
            return;
        }
        StringBuilder y = a.y("Invalid start code: ");
        y.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(y.toString());
    }

    private void printAttributes() {
        for (int i2 = 0; i2 < this.mAttributes.length; i2++) {
            StringBuilder z = a.z("The size of tag group[", i2, "]: ");
            z.append(this.mAttributes[i2].size());
            Log.d(TAG, z.toString());
            for (Map.Entry next : this.mAttributes[i2].entrySet()) {
                ExifAttribute exifAttribute = (ExifAttribute) next.getValue();
                StringBuilder y = a.y("tagName: ");
                y.append((String) next.getKey());
                y.append(", tagType: ");
                y.append(exifAttribute.toString());
                y.append(", tagValue: '");
                y.append(exifAttribute.getStringValue(this.mExifByteOrder));
                y.append("'");
                Log.d(TAG, y.toString());
            }
        }
    }

    private ByteOrder readByteOrder(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        short readShort = byteOrderedDataInputStream.readShort();
        if (readShort == 18761) {
            if (DEBUG) {
                Log.d(TAG, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (DEBUG) {
                Log.d(TAG, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder y = a.y("Invalid byte order: ");
            y.append(Integer.toHexString(readShort));
            throw new IOException(y.toString());
        }
    }

    private void readExifSegment(byte[] bArr, int i2) {
        ByteOrderedDataInputStream byteOrderedDataInputStream = new ByteOrderedDataInputStream(bArr);
        parseTiffHeaders(byteOrderedDataInputStream, bArr.length);
        readImageFileDirectory(byteOrderedDataInputStream, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0253  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readImageFileDirectory(androidx.exifinterface.media.ExifInterface.ByteOrderedDataInputStream r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            java.util.Set<java.lang.Integer> r3 = r0.mAttributesOffsets
            int r4 = r1.mPosition
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.mPosition
            int r3 = r3 + 2
            int r4 = r1.mLength
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r27.readShort()
            boolean r4 = DEBUG
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0038
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0038:
            int r4 = r1.mPosition
            int r6 = r3 * 12
            int r6 = r6 + r4
            int r4 = r1.mLength
            if (r6 > r4) goto L_0x03bb
            if (r3 > 0) goto L_0x0045
            goto L_0x03bb
        L_0x0045:
            r4 = 0
            r6 = r4
        L_0x0047:
            r7 = 5
            if (r4 >= r3) goto L_0x033f
            int r8 = r27.readUnsignedShort()
            int r9 = r27.readUnsignedShort()
            int r12 = r27.readInt()
            int r10 = r27.peek()
            long r10 = (long) r10
            r13 = 4
            long r10 = r10 + r13
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.ExifInterface$ExifTag>[] r15 = sExifTagMapsForReading
            r15 = r15[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r15.get(r13)
            r15 = r13
            androidx.exifinterface.media.ExifInterface$ExifTag r15 = (androidx.exifinterface.media.ExifInterface.ExifTag) r15
            boolean r13 = DEBUG
            r14 = 3
            if (r13 == 0) goto L_0x00a2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r28)
            r7[r6] = r18
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r18 = 1
            r7[r18] = r6
            if (r15 == 0) goto L_0x0087
            java.lang.String r6 = r15.name
            goto L_0x0088
        L_0x0087:
            r6 = 0
        L_0x0088:
            r18 = 2
            r7[r18] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r7[r14] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r14 = 4
            r7[r14] = r6
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r6 = java.lang.String.format(r6, r7)
            android.util.Log.d(r5, r6)
        L_0x00a2:
            r6 = 7
            if (r15 != 0) goto L_0x00b5
            if (r13 == 0) goto L_0x00e3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r8)
            goto L_0x00dc
        L_0x00b5:
            if (r9 <= 0) goto L_0x011d
            int[] r7 = IFD_FORMAT_BYTES_PER_FORMAT
            int r14 = r7.length
            if (r9 < r14) goto L_0x00bd
            goto L_0x011d
        L_0x00bd:
            boolean r14 = r15.isFormatCompatible(r9)
            if (r14 != 0) goto L_0x00e8
            if (r13 == 0) goto L_0x00e3
            java.lang.String r6 = "Skip the tag entry since data format ("
            java.lang.StringBuilder r6 = b.e.a.a.a.y(r6)
            java.lang.String[] r7 = IFD_FORMAT_NAMES
            r7 = r7[r9]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r15.name
            r6.append(r7)
        L_0x00dc:
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00e3:
            r19 = r3
            r18 = r4
            goto L_0x0137
        L_0x00e8:
            if (r9 != r6) goto L_0x00ec
            int r9 = r15.primaryFormat
        L_0x00ec:
            r6 = r3
            r18 = r4
            long r3 = (long) r12
            r7 = r7[r9]
            r19 = r6
            long r6 = (long) r7
            long r3 = r3 * r6
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0106
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r6 = 1
            goto L_0x013a
        L_0x0106:
            if (r13 == 0) goto L_0x0139
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto L_0x0139
        L_0x011d:
            r19 = r3
            r18 = r4
            if (r13 == 0) goto L_0x0137
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0137:
            r3 = 0
        L_0x0139:
            r6 = 0
        L_0x013a:
            if (r6 != 0) goto L_0x0141
        L_0x013c:
            r1.seek(r10)
            goto L_0x0335
        L_0x0141:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x01f5
            int r6 = r27.readInt()
            if (r13 == 0) goto L_0x0166
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r16 = r10
            java.lang.String r10 = "seek to data offset: "
            r14.append(r10)
            r14.append(r6)
            java.lang.String r10 = r14.toString()
            android.util.Log.d(r5, r10)
            goto L_0x0168
        L_0x0166:
            r16 = r10
        L_0x0168:
            int r10 = r0.mMimeType
            r11 = 7
            if (r10 != r11) goto L_0x01c5
            java.lang.String r10 = r15.name
            java.lang.String r11 = "MakerNote"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x017a
            r0.mOrfMakerNoteOffset = r6
            goto L_0x01c2
        L_0x017a:
            r10 = 6
            if (r2 != r10) goto L_0x01c2
            java.lang.String r10 = r15.name
            java.lang.String r11 = "ThumbnailImage"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x01c2
            r0.mOrfThumbnailOffset = r6
            r0.mOrfThumbnailLength = r12
            java.nio.ByteOrder r10 = r0.mExifByteOrder
            r11 = 6
            androidx.exifinterface.media.ExifInterface$ExifAttribute r10 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort((int) r11, (java.nio.ByteOrder) r10)
            int r11 = r0.mOrfThumbnailOffset
            r14 = r12
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r2 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r11, (java.nio.ByteOrder) r2)
            int r11 = r0.mOrfThumbnailLength
            long r11 = (long) r11
            r20 = r14
            java.nio.ByteOrder r14 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r11 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long) r11, (java.nio.ByteOrder) r14)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r12 = r0.mAttributes
            r14 = 4
            r12 = r12[r14]
            r12.put(r7, r10)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r10 = r0.mAttributes
            r10 = r10[r14]
            java.lang.String r12 = "JPEGInterchangeFormat"
            r10.put(r12, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r14]
            java.lang.String r10 = "JPEGInterchangeFormatLength"
            r2.put(r10, r11)
            goto L_0x01d7
        L_0x01c2:
            r20 = r12
            goto L_0x01d7
        L_0x01c5:
            r20 = r12
            r2 = 10
            if (r10 != r2) goto L_0x01d7
            java.lang.String r2 = r15.name
            java.lang.String r10 = "JpgFromRaw"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01d7
            r0.mRw2JpgFromRawOffset = r6
        L_0x01d7:
            long r10 = (long) r6
            long r21 = r10 + r3
            int r2 = r1.mLength
            r23 = r15
            long r14 = (long) r2
            int r2 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x01e7
            r1.seek(r10)
            goto L_0x01fb
        L_0x01e7:
            if (r13 == 0) goto L_0x01f1
            java.lang.String r2 = "Skip the tag entry since data offset is invalid: "
            java.lang.String r2 = b.e.a.a.a.g(r2, r6)
            goto L_0x02bb
        L_0x01f1:
            r10 = r16
            goto L_0x0333
        L_0x01f5:
            r16 = r10
            r20 = r12
            r23 = r15
        L_0x01fb:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = sExifPointerTagMap
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r13 == 0) goto L_0x0225
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "nextIfdType: "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = " byteCount: "
            r6.append(r8)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x0225:
            r6 = 8
            if (r2 == 0) goto L_0x02c0
            r3 = -1
            r7 = 3
            if (r9 == r7) goto L_0x024b
            r7 = 4
            if (r9 == r7) goto L_0x0246
            if (r9 == r6) goto L_0x0241
            r6 = 9
            if (r9 == r6) goto L_0x023c
            r6 = 13
            if (r9 == r6) goto L_0x023c
            goto L_0x0250
        L_0x023c:
            int r3 = r27.readInt()
            goto L_0x024f
        L_0x0241:
            short r3 = r27.readShort()
            goto L_0x024f
        L_0x0246:
            long r3 = r27.readUnsignedInt()
            goto L_0x0250
        L_0x024b:
            int r3 = r27.readUnsignedShort()
        L_0x024f:
            long r3 = (long) r3
        L_0x0250:
            r6 = 2
            if (r13 == 0) goto L_0x026c
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            r8 = 0
            r6[r8] = r7
            r8 = r23
            java.lang.String r7 = r8.name
            r8 = 1
            r6[r8] = r7
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x026c:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x02b3
            int r6 = r1.mLength
            long r6 = (long) r6
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x02b3
            java.util.Set<java.lang.Integer> r6 = r0.mAttributesOffsets
            int r7 = (int) r3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0292
            r1.seek(r3)
            int r2 = r2.intValue()
            r0.readImageFileDirectory(r1, r2)
            goto L_0x01f1
        L_0x0292:
            if (r13 == 0) goto L_0x01f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            java.lang.String r2 = ")"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            goto L_0x02bb
        L_0x02b3:
            if (r13 == 0) goto L_0x01f1
            java.lang.String r2 = "Skip jump into the IFD since its offset is invalid: "
            java.lang.String r2 = b.e.a.a.a.j(r2, r3)
        L_0x02bb:
            android.util.Log.d(r5, r2)
            goto L_0x01f1
        L_0x02c0:
            r8 = r23
            int r2 = r27.peek()
            int r3 = (int) r3
            byte[] r15 = new byte[r3]
            r1.readFully(r15)
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = new androidx.exifinterface.media.ExifInterface$ExifAttribute
            long r13 = (long) r2
            r11 = r16
            r10 = r3
            r24 = r11
            r11 = r9
            r12 = r20
            r2 = r8
            r10.<init>(r11, r12, r13, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r4 = r0.mAttributes
            r4 = r4[r28]
            java.lang.String r8 = r2.name
            r4.put(r8, r3)
            java.lang.String r4 = r2.name
            java.lang.String r8 = "DNGVersion"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x02f1
            r4 = 3
            r0.mMimeType = r4
        L_0x02f1:
            java.lang.String r4 = r2.name
            java.lang.String r8 = "Make"
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L_0x0305
            java.lang.String r4 = r2.name
            java.lang.String r8 = "Model"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x0313
        L_0x0305:
            java.nio.ByteOrder r4 = r0.mExifByteOrder
            java.lang.String r4 = r3.getStringValue(r4)
            java.lang.String r8 = "PENTAX"
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x0326
        L_0x0313:
            java.lang.String r2 = r2.name
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0328
            java.nio.ByteOrder r2 = r0.mExifByteOrder
            int r2 = r3.getIntValue(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x0328
        L_0x0326:
            r0.mMimeType = r6
        L_0x0328:
            int r2 = r27.peek()
            long r2 = (long) r2
            r10 = r24
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0335
        L_0x0333:
            goto L_0x013c
        L_0x0335:
            int r4 = r18 + 1
            short r4 = (short) r4
            r6 = 0
            r2 = r28
            r3 = r19
            goto L_0x0047
        L_0x033f:
            int r2 = r27.peek()
            int r2 = r2 + 4
            int r3 = r1.mLength
            if (r2 > r3) goto L_0x03bb
            int r2 = r27.readInt()
            boolean r3 = DEBUG
            if (r3 == 0) goto L_0x0364
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r4[r8] = r6
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x0364:
            long r8 = (long) r2
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x03a5
            int r4 = r1.mLength
            if (r2 >= r4) goto L_0x03a5
            java.util.Set<java.lang.Integer> r4 = r0.mAttributesOffsets
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x039b
            r1.seek(r8)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x038d
            r0.readImageFileDirectory(r1, r3)
            goto L_0x03bb
        L_0x038d:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r2 = r0.mAttributes
            r2 = r2[r7]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03bb
            r0.readImageFileDirectory(r1, r7)
            goto L_0x03bb
        L_0x039b:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x03ae
        L_0x03a5:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x03ae:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.readImageFileDirectory(androidx.exifinterface.media.ExifInterface$ByteOrderedDataInputStream, int):void");
    }

    private void removeAttribute(String str) {
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            this.mAttributes[i2].remove(str);
        }
    }

    private void retrieveJpegImageSize(ByteOrderedDataInputStream byteOrderedDataInputStream, int i2) {
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2 = this.mAttributes[i2].get(TAG_IMAGE_LENGTH);
        ExifAttribute exifAttribute3 = this.mAttributes[i2].get(TAG_IMAGE_WIDTH);
        if ((exifAttribute2 == null || exifAttribute3 == null) && (exifAttribute = this.mAttributes[i2].get(TAG_JPEG_INTERCHANGE_FORMAT)) != null) {
            getJpegAttributes(byteOrderedDataInputStream, exifAttribute.getIntValue(this.mExifByteOrder), i2);
        }
    }

    private void saveJpegAttributes(InputStream inputStream, OutputStream outputStream) {
        if (DEBUG) {
            Log.d(TAG, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(outputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() == -1) {
            byteOrderedDataOutputStream.writeByte(-1);
            if (dataInputStream.readByte() == -40) {
                byteOrderedDataOutputStream.writeByte(-40);
                byteOrderedDataOutputStream.writeByte(-1);
                byteOrderedDataOutputStream.writeByte(-31);
                writeExifSegment(byteOrderedDataOutputStream, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        byteOrderedDataOutputStream.writeByte(-1);
                        byteOrderedDataOutputStream.writeByte(readByte);
                        copy(dataInputStream, byteOrderedDataOutputStream);
                        return;
                    } else if (readByte != -31) {
                        byteOrderedDataOutputStream.writeByte(-1);
                        byteOrderedDataOutputStream.writeByte(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort);
                        int i2 = readUnsignedShort - 2;
                        if (i2 >= 0) {
                            while (i2 > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i2, 4096));
                                if (read < 0) {
                                    break;
                                }
                                byteOrderedDataOutputStream.write(bArr, 0, read);
                                i2 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, IDENTIFIER_EXIF_APP1)) {
                                    int i3 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i3) != i3) {
                                        throw new IOException("Invalid length");
                                    }
                                }
                            }
                            byteOrderedDataOutputStream.writeByte(-1);
                            byteOrderedDataOutputStream.writeByte(readByte);
                            byteOrderedDataOutputStream.writeUnsignedShort(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                byteOrderedDataOutputStream.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 < 0) {
                                    break;
                                }
                                byteOrderedDataOutputStream.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void setThumbnailData(ByteOrderedDataInputStream byteOrderedDataInputStream) {
        HashMap<String, ExifAttribute> hashMap = this.mAttributes[4];
        ExifAttribute exifAttribute = hashMap.get(TAG_COMPRESSION);
        if (exifAttribute != null) {
            int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
            this.mThumbnailCompression = intValue;
            if (intValue != 1) {
                if (intValue != 6) {
                    if (intValue != 7) {
                        return;
                    }
                }
            }
            if (isSupportedDataType(hashMap)) {
                handleThumbnailFromStrips(byteOrderedDataInputStream, hashMap);
                return;
            }
            return;
        }
        this.mThumbnailCompression = 6;
        handleThumbnailFromJfif(byteOrderedDataInputStream, hashMap);
    }

    private static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private void swapBasedOnImageSize(int i2, int i3) {
        String str;
        if (!this.mAttributes[i2].isEmpty() && !this.mAttributes[i3].isEmpty()) {
            ExifAttribute exifAttribute = this.mAttributes[i2].get(TAG_IMAGE_LENGTH);
            ExifAttribute exifAttribute2 = this.mAttributes[i2].get(TAG_IMAGE_WIDTH);
            ExifAttribute exifAttribute3 = this.mAttributes[i3].get(TAG_IMAGE_LENGTH);
            ExifAttribute exifAttribute4 = this.mAttributes[i3].get(TAG_IMAGE_WIDTH);
            if (exifAttribute == null || exifAttribute2 == null) {
                if (DEBUG) {
                    str = "First image does not contain valid size information";
                } else {
                    return;
                }
            } else if (exifAttribute3 != null && exifAttribute4 != null) {
                int intValue = exifAttribute.getIntValue(this.mExifByteOrder);
                int intValue2 = exifAttribute2.getIntValue(this.mExifByteOrder);
                int intValue3 = exifAttribute3.getIntValue(this.mExifByteOrder);
                int intValue4 = exifAttribute4.getIntValue(this.mExifByteOrder);
                if (intValue < intValue3 && intValue2 < intValue4) {
                    HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
                    HashMap<String, ExifAttribute> hashMap = hashMapArr[i2];
                    hashMapArr[i2] = hashMapArr[i3];
                    hashMapArr[i3] = hashMap;
                    return;
                }
                return;
            } else if (DEBUG) {
                str = "Second image does not contain valid size information";
            } else {
                return;
            }
            Log.d(TAG, str);
        } else if (DEBUG) {
            Log.d(TAG, "Cannot perform swap since only one image data exists");
        }
    }

    private boolean updateAttribute(String str, ExifAttribute exifAttribute) {
        boolean z = false;
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            if (this.mAttributes[i2].containsKey(str)) {
                this.mAttributes[i2].put(str, exifAttribute);
                z = true;
            }
        }
        return z;
    }

    private void updateImageSizeValues(ByteOrderedDataInputStream byteOrderedDataInputStream, int i2) {
        StringBuilder sb;
        String str;
        ExifAttribute exifAttribute;
        ExifAttribute exifAttribute2;
        ExifAttribute exifAttribute3 = this.mAttributes[i2].get(TAG_DEFAULT_CROP_SIZE);
        ExifAttribute exifAttribute4 = this.mAttributes[i2].get(TAG_RW2_SENSOR_TOP_BORDER);
        ExifAttribute exifAttribute5 = this.mAttributes[i2].get(TAG_RW2_SENSOR_LEFT_BORDER);
        ExifAttribute exifAttribute6 = this.mAttributes[i2].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        ExifAttribute exifAttribute7 = this.mAttributes[i2].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (exifAttribute3 != null) {
            if (exifAttribute3.format == 5) {
                Rational[] rationalArr = (Rational[]) exifAttribute3.getValue(this.mExifByteOrder);
                if (rationalArr == null || rationalArr.length != 2) {
                    sb = a.y("Invalid crop size values. cropSize=");
                    str = Arrays.toString(rationalArr);
                    sb.append(str);
                    Log.w(TAG, sb.toString());
                    return;
                }
                exifAttribute2 = ExifAttribute.createURational(rationalArr[0], this.mExifByteOrder);
                exifAttribute = ExifAttribute.createURational(rationalArr[1], this.mExifByteOrder);
            } else {
                int[] iArr = (int[]) exifAttribute3.getValue(this.mExifByteOrder);
                if (iArr == null || iArr.length != 2) {
                    sb = a.y("Invalid crop size values. cropSize=");
                    str = Arrays.toString(iArr);
                    sb.append(str);
                    Log.w(TAG, sb.toString());
                    return;
                }
                exifAttribute2 = ExifAttribute.createUShort(iArr[0], this.mExifByteOrder);
                exifAttribute = ExifAttribute.createUShort(iArr[1], this.mExifByteOrder);
            }
            this.mAttributes[i2].put(TAG_IMAGE_WIDTH, exifAttribute2);
            this.mAttributes[i2].put(TAG_IMAGE_LENGTH, exifAttribute);
        } else if (exifAttribute4 == null || exifAttribute5 == null || exifAttribute6 == null || exifAttribute7 == null) {
            retrieveJpegImageSize(byteOrderedDataInputStream, i2);
        } else {
            int intValue = exifAttribute4.getIntValue(this.mExifByteOrder);
            int intValue2 = exifAttribute6.getIntValue(this.mExifByteOrder);
            int intValue3 = exifAttribute7.getIntValue(this.mExifByteOrder);
            int intValue4 = exifAttribute5.getIntValue(this.mExifByteOrder);
            if (intValue2 > intValue && intValue3 > intValue4) {
                ExifAttribute createUShort = ExifAttribute.createUShort(intValue2 - intValue, this.mExifByteOrder);
                ExifAttribute createUShort2 = ExifAttribute.createUShort(intValue3 - intValue4, this.mExifByteOrder);
                this.mAttributes[i2].put(TAG_IMAGE_LENGTH, createUShort);
                this.mAttributes[i2].put(TAG_IMAGE_WIDTH, createUShort2);
            }
        }
    }

    private void validateImages(InputStream inputStream) {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        ExifAttribute exifAttribute = this.mAttributes[1].get(TAG_PIXEL_X_DIMENSION);
        ExifAttribute exifAttribute2 = this.mAttributes[1].get(TAG_PIXEL_Y_DIMENSION);
        if (!(exifAttribute == null || exifAttribute2 == null)) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, exifAttribute);
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, exifAttribute2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            HashMap<String, ExifAttribute>[] hashMapArr = this.mAttributes;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!isThumbnail(this.mAttributes[4])) {
            Log.d(TAG, "No image meets the size requirements of a thumbnail image.");
        }
    }

    private int writeExifSegment(ByteOrderedDataOutputStream byteOrderedDataOutputStream, int i2) {
        ByteOrderedDataOutputStream byteOrderedDataOutputStream2 = byteOrderedDataOutputStream;
        ExifTag[][] exifTagArr = EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (ExifTag exifTag : EXIF_POINTER_TAGS) {
            removeAttribute(exifTag.name);
        }
        removeAttribute(JPEG_INTERCHANGE_FORMAT_TAG.name);
        removeAttribute(JPEG_INTERCHANGE_FORMAT_LENGTH_TAG.name);
        for (int i3 = 0; i3 < EXIF_TAGS.length; i3++) {
            for (Object obj : this.mAttributes[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.mAttributes[i3].remove(entry.getKey());
                }
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0, this.mExifByteOrder));
        }
        if (this.mHasThumbnail) {
            this.mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_TAG.name, ExifAttribute.createULong(0, this.mExifByteOrder));
            this.mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_LENGTH_TAG.name, ExifAttribute.createULong((long) this.mThumbnailLength, this.mExifByteOrder));
        }
        for (int i4 = 0; i4 < EXIF_TAGS.length; i4++) {
            int i5 = 0;
            for (Map.Entry<String, ExifAttribute> value : this.mAttributes[i4].entrySet()) {
                int size = ((ExifAttribute) value.getValue()).size();
                if (size > 4) {
                    i5 += size;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int i6 = 8;
        for (int i7 = 0; i7 < EXIF_TAGS.length; i7++) {
            if (!this.mAttributes[i7].isEmpty()) {
                iArr[i7] = i6;
                i6 += (this.mAttributes[i7].size() * 12) + 2 + 4 + iArr2[i7];
            }
        }
        if (this.mHasThumbnail) {
            this.mAttributes[4].put(JPEG_INTERCHANGE_FORMAT_TAG.name, ExifAttribute.createULong((long) i6, this.mExifByteOrder));
            this.mThumbnailOffset = i2 + i6;
            i6 += this.mThumbnailLength;
        }
        int i8 = i6 + 8;
        if (DEBUG) {
            Log.d(TAG, "totalSize length: " + i8);
            for (int i9 = 0; i9 < EXIF_TAGS.length; i9++) {
                Log.d(TAG, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d", new Object[]{Integer.valueOf(i9), Integer.valueOf(iArr[i9]), Integer.valueOf(this.mAttributes[i9].size()), Integer.valueOf(iArr2[i9])}));
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong((long) iArr[1], this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong((long) iArr[2], this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong((long) iArr[3], this.mExifByteOrder));
        }
        byteOrderedDataOutputStream2.writeUnsignedShort(i8);
        byteOrderedDataOutputStream2.write(IDENTIFIER_EXIF_APP1);
        byteOrderedDataOutputStream2.writeShort(this.mExifByteOrder == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream2.setByteOrder(this.mExifByteOrder);
        byteOrderedDataOutputStream2.writeUnsignedShort(42);
        byteOrderedDataOutputStream2.writeUnsignedInt(8);
        int i10 = 0;
        while (i10 < EXIF_TAGS.length) {
            if (!this.mAttributes[i10].isEmpty()) {
                byteOrderedDataOutputStream2.writeUnsignedShort(this.mAttributes[i10].size());
                int size2 = (this.mAttributes[i10].size() * 12) + iArr[i10] + 2 + 4;
                for (Map.Entry next : this.mAttributes[i10].entrySet()) {
                    int i11 = sExifTagMapsForWriting[i10].get(next.getKey()).number;
                    ExifAttribute exifAttribute = (ExifAttribute) next.getValue();
                    int size3 = exifAttribute.size();
                    byteOrderedDataOutputStream2.writeUnsignedShort(i11);
                    byteOrderedDataOutputStream2.writeUnsignedShort(exifAttribute.format);
                    byteOrderedDataOutputStream2.writeInt(exifAttribute.numberOfComponents);
                    if (size3 > 4) {
                        byteOrderedDataOutputStream2.writeUnsignedInt((long) size2);
                        size2 += size3;
                    } else {
                        byteOrderedDataOutputStream2.write(exifAttribute.bytes);
                        if (size3 < 4) {
                            while (size3 < 4) {
                                byteOrderedDataOutputStream2.writeByte(0);
                                size3++;
                            }
                        }
                    }
                }
                byteOrderedDataOutputStream2.writeUnsignedInt((i10 != 0 || this.mAttributes[4].isEmpty()) ? 0 : (long) iArr[4]);
                for (Map.Entry<String, ExifAttribute> value2 : this.mAttributes[i10].entrySet()) {
                    byte[] bArr = ((ExifAttribute) value2.getValue()).bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream2.write(bArr, 0, bArr.length);
                    }
                }
            }
            i10++;
        }
        if (this.mHasThumbnail) {
            byteOrderedDataOutputStream2.write(getThumbnailBytes());
        }
        byteOrderedDataOutputStream2.setByteOrder(ByteOrder.BIG_ENDIAN);
        return i8;
    }

    public void flipHorizontally() {
        int i2 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i2 = 2;
                break;
            case 2:
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 7;
                break;
            default:
                i2 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i2));
    }

    public void flipVertically() {
        int i2 = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                break;
            case 5:
                i2 = 8;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 5;
                break;
            default:
                i2 = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i2));
    }

    public double getAltitude(double d) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int i2 = -1;
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < ShadowDrawableWrapper.COS_45 || attributeInt < 0) {
            return d;
        }
        if (attributeInt != 1) {
            i2 = 1;
        }
        return attributeDouble * ((double) i2);
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mExifByteOrder);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                int i2 = exifAttribute.format;
                if (i2 == 5 || i2 == 10) {
                    Rational[] rationalArr = (Rational[]) exifAttribute.getValue(this.mExifByteOrder);
                    if (rationalArr == null || rationalArr.length != 3) {
                        StringBuilder y = a.y("Invalid GPS Timestamp array. array=");
                        y.append(Arrays.toString(rationalArr));
                        str2 = y.toString();
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) rationalArr[0].numerator) / ((float) rationalArr[0].denominator))), Integer.valueOf((int) (((float) rationalArr[1].numerator) / ((float) rationalArr[1].denominator))), Integer.valueOf((int) (((float) rationalArr[2].numerator) / ((float) rationalArr[2].denominator)))});
                    }
                } else {
                    StringBuilder y2 = a.y("GPS Timestamp format is not rational. format=");
                    y2.append(exifAttribute.format);
                    str2 = y2.toString();
                }
                Log.w(TAG, str2);
                return null;
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mExifByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public byte[] getAttributeBytes(@NonNull String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.bytes;
        }
        return null;
    }

    public double getAttributeDouble(@NonNull String str, double d) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return d;
        }
        try {
            return exifAttribute.getDoubleValue(this.mExifByteOrder);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    public int getAttributeInt(@NonNull String str, int i2) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute == null) {
            return i2;
        }
        try {
            return exifAttribute.getIntValue(this.mExifByteOrder);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    @Nullable
    public long[] getAttributeRange(@NonNull String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if (!this.mModified) {
            ExifAttribute exifAttribute = getExifAttribute(str);
            if (exifAttribute == null) {
                return null;
            }
            return new long[]{exifAttribute.bytesOffset, (long) exifAttribute.bytes.length};
        }
        throw new IllegalStateException("The underlying file has been modified since being parsed");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long getDateTime() {
        return parseDateTime(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long getDateTimeDigitized() {
        return parseDateTime(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long getDateTimeOriginal() {
        return parseDateTime(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (!(attribute == null || attribute2 == null)) {
            Pattern pattern = sNonZeroTimePattern;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                try {
                    Date parse = sFormatter.parse(attribute + ' ' + attribute2, new ParsePosition(0));
                    if (parse == null) {
                        return -1;
                    }
                    return parse.getTime();
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return -1;
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    @Nullable
    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder y = a.y("Latitude/longitude values are not parsable. ");
            y.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{attribute, attribute2, attribute3, attribute4}));
            Log.w(TAG, y.toString());
            return null;
        }
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return BaseTransientBottomBar.ANIMATION_FADE_DURATION;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @Nullable
    public byte[] getThumbnail() {
        int i2 = this.mThumbnailCompression;
        if (i2 == 6 || i2 == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    @Nullable
    public Bitmap getThumbnailBitmap() {
        if (!this.mHasThumbnail) {
            return null;
        }
        if (this.mThumbnailBytes == null) {
            this.mThumbnailBytes = getThumbnailBytes();
        }
        int i2 = this.mThumbnailCompression;
        if (i2 == 6 || i2 == 7) {
            return BitmapFactory.decodeByteArray(this.mThumbnailBytes, 0, this.mThumbnailLength);
        }
        if (i2 == 1) {
            int length = this.mThumbnailBytes.length / 3;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                byte[] bArr = this.mThumbnailBytes;
                int i4 = i3 * 3;
                iArr[i3] = (bArr[i4] << 16) + 0 + (bArr[i4 + 1] << 8) + bArr[i4 + 2];
            }
            ExifAttribute exifAttribute = this.mAttributes[4].get(TAG_IMAGE_LENGTH);
            ExifAttribute exifAttribute2 = this.mAttributes[4].get(TAG_IMAGE_WIDTH);
            if (!(exifAttribute == null || exifAttribute2 == null)) {
                return Bitmap.createBitmap(iArr, exifAttribute2.getIntValue(this.mExifByteOrder), exifAttribute.getIntValue(this.mExifByteOrder), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[SYNTHETIC, Splitter:B:38:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0093 A[Catch:{ Exception -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b5  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getThumbnailBytes() {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.mHasThumbnail
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r9.mThumbnailBytes
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r9.mAssetInputStream     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
        L_0x001a:
            r3 = r2
            goto L_0x005c
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0029, all -> 0x0025 }
            closeQuietly(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00af
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x00a0
        L_0x002e:
            java.lang.String r1 = r9.mFilename     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            java.lang.String r3 = r9.mFilename     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            goto L_0x001a
        L_0x003a:
            java.io.FileDescriptor r1 = r9.mSeekableFileDescriptor     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            if (r1 == 0) goto L_0x005a
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch:{ Exception -> 0x009c, all -> 0x0099 }
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            android.system.Os.lseek(r1, r3, r5)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0055, all -> 0x0052 }
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x005c
        L_0x0052:
            r0 = move-exception
            r3 = r1
            goto L_0x00b0
        L_0x0055:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x00a0
        L_0x005a:
            r1 = r2
            r3 = r1
        L_0x005c:
            if (r1 == 0) goto L_0x0093
            int r4 = r9.mThumbnailOffset     // Catch:{ Exception -> 0x0091 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0091 }
            long r4 = r1.skip(r4)     // Catch:{ Exception -> 0x0091 }
            int r6 = r9.mThumbnailOffset     // Catch:{ Exception -> 0x0091 }
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L_0x008b
            int r4 = r9.mThumbnailLength     // Catch:{ Exception -> 0x0091 }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0091 }
            int r6 = r1.read(r4)     // Catch:{ Exception -> 0x0091 }
            int r7 = r9.mThumbnailLength     // Catch:{ Exception -> 0x0091 }
            if (r6 != r7) goto L_0x0085
            r9.mThumbnailBytes = r4     // Catch:{ Exception -> 0x0091 }
            closeQuietly(r1)
            if (r3 == 0) goto L_0x0084
            closeFileDescriptor(r3)
        L_0x0084:
            return r4
        L_0x0085:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x008b:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ Exception -> 0x0091 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x0091:
            r4 = move-exception
            goto L_0x00a0
        L_0x0093:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Exception -> 0x0091 }
            r4.<init>()     // Catch:{ Exception -> 0x0091 }
            throw r4     // Catch:{ Exception -> 0x0091 }
        L_0x0099:
            r0 = move-exception
            r3 = r2
            goto L_0x00b0
        L_0x009c:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x00a0:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00ae }
            closeQuietly(r1)
            if (r3 == 0) goto L_0x00ad
            closeFileDescriptor(r3)
        L_0x00ad:
            return r2
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            r2 = r1
        L_0x00b0:
            closeQuietly(r2)
            if (r3 == 0) goto L_0x00b8
            closeFileDescriptor(r3)
        L_0x00b8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.getThumbnailBytes():byte[]");
    }

    @Nullable
    public long[] getThumbnailRange() {
        if (this.mModified) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        } else if (!this.mHasThumbnail) {
            return null;
        } else {
            return new long[]{(long) this.mThumbnailOffset, (long) this.mThumbnailLength};
        }
    }

    public boolean hasAttribute(@NonNull String str) {
        return getExifAttribute(str) != null;
    }

    public boolean hasThumbnail() {
        return this.mHasThumbnail;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.mHasThumbnail) {
            return false;
        }
        int i2 = this.mThumbnailCompression;
        return i2 == 6 || i2 == 7;
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r7 < 0) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r7 < 0) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void rotate(int r7) {
        /*
            r6 = this;
            int r0 = r7 % 90
            if (r0 != 0) goto L_0x0057
            r0 = 1
            java.lang.String r1 = "Orientation"
            int r0 = r6.getAttributeInt(r1, r0)
            java.util.List<java.lang.Integer> r2 = ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            r4 = 0
            r5 = 4
            if (r3 == 0) goto L_0x0034
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r7 = r7 + r0
            int r7 = r7 % r5
            if (r7 >= 0) goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            int r7 = r7 + r4
            java.lang.Object r7 = r2.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r4 = r7.intValue()
            goto L_0x004f
        L_0x0034:
            java.util.List<java.lang.Integer> r2 = FLIPPED_ROTATION_ORDER
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x004f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r2.indexOf(r0)
            int r7 = r7 / 90
            int r7 = r7 + r0
            int r7 = r7 % r5
            if (r7 >= 0) goto L_0x0028
            goto L_0x0027
        L_0x004f:
            java.lang.String r7 = java.lang.Integer.toString(r4)
            r6.setAttribute(r1, r7)
            return
        L_0x0057:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "degree should be a multiple of 90"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.rotate(int):void");
    }

    /* JADX WARNING: type inference failed for: r5v15, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5 A[Catch:{ Exception -> 0x00f7, all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd A[Catch:{ Exception -> 0x00f7, all -> 0x00f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0103 A[Catch:{ all -> 0x0126 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011e A[Catch:{ all -> 0x0126 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void saveAttributes() {
        /*
            r8 = this;
            boolean r0 = r8.mIsSupportedFile
            if (r0 == 0) goto L_0x0146
            int r0 = r8.mMimeType
            r1 = 4
            if (r0 != r1) goto L_0x0146
            java.io.FileDescriptor r0 = r8.mSeekableFileDescriptor
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r8.mFilename
            if (r0 == 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x001a:
            r0 = 1
            r8.mModified = r0
            byte[] r0 = r8.getThumbnail()
            r8.mThumbnailBytes = r0
            java.lang.String r0 = r8.mFilename
            r1 = 0
            if (r0 == 0) goto L_0x0030
            java.io.File r0 = new java.io.File
            java.lang.String r2 = r8.mFilename
            r0.<init>(r2)
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            java.lang.String r2 = r8.mFilename     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r3 = 0
            if (r2 == 0) goto L_0x0072
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r5.<init>()     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r6 = r8.mFilename     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r5.append(r6)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r6 = ".tmp"
            r5.append(r6)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            boolean r5 = r0.renameTo(r2)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            if (r5 == 0) goto L_0x0057
            r5 = r1
            goto L_0x00a5
        L_0x0057:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r3.<init>()     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r4 = "Couldn't rename to "
            r3.append(r4)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r3.append(r2)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            throw r0     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
        L_0x0072:
            java.io.FileDescriptor r2 = r8.mSeekableFileDescriptor     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            if (r2 == 0) goto L_0x00a3
            java.lang.String r2 = "temp"
            java.lang.String r5 = "jpg"
            java.io.File r2 = java.io.File.createTempFile(r2, r5)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.io.FileDescriptor r5 = r8.mSeekableFileDescriptor     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            android.system.Os.lseek(r5, r3, r6)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.io.FileDescriptor r6 = r8.mSeekableFileDescriptor     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0134, all -> 0x0131 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x009e, all -> 0x0099 }
            copy(r5, r6)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
            goto L_0x00a6
        L_0x0095:
            r0 = move-exception
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            goto L_0x00a0
        L_0x0099:
            r0 = move-exception
            r6 = r1
        L_0x009b:
            r1 = r5
            goto L_0x013f
        L_0x009e:
            r0 = move-exception
            r6 = r1
        L_0x00a0:
            r1 = r5
            goto L_0x0136
        L_0x00a3:
            r2 = r1
            r5 = r2
        L_0x00a5:
            r6 = r5
        L_0x00a6:
            closeQuietly(r5)
            closeQuietly(r6)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.lang.String r6 = r8.mFilename     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            if (r6 == 0) goto L_0x00bd
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.lang.String r4 = r8.mFilename     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            goto L_0x00cf
        L_0x00bd:
            java.io.FileDescriptor r6 = r8.mSeekableFileDescriptor     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            if (r6 == 0) goto L_0x00ce
            int r7 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            android.system.Os.lseek(r6, r3, r7)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.io.FileDescriptor r4 = r8.mSeekableFileDescriptor     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            goto L_0x00cf
        L_0x00ce:
            r3 = r1
        L_0x00cf:
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00f7, all -> 0x00f4 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00f0, all -> 0x00ec }
            r8.saveJpegAttributes(r4, r5)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            closeQuietly(r4)
            closeQuietly(r5)
            r2.delete()
            r8.mThumbnailBytes = r1
            return
        L_0x00e8:
            r0 = move-exception
            goto L_0x00ee
        L_0x00ea:
            r3 = move-exception
            goto L_0x00f2
        L_0x00ec:
            r0 = move-exception
            r5 = r1
        L_0x00ee:
            r1 = r4
            goto L_0x0127
        L_0x00f0:
            r3 = move-exception
            r5 = r1
        L_0x00f2:
            r1 = r4
            goto L_0x00f9
        L_0x00f4:
            r0 = move-exception
            r5 = r1
            goto L_0x0127
        L_0x00f7:
            r3 = move-exception
            r5 = r1
        L_0x00f9:
            java.lang.String r4 = r8.mFilename     // Catch:{ all -> 0x0126 }
            if (r4 == 0) goto L_0x011e
            boolean r4 = r2.renameTo(r0)     // Catch:{ all -> 0x0126 }
            if (r4 != 0) goto L_0x011e
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0126 }
            r4.<init>()     // Catch:{ all -> 0x0126 }
            java.lang.String r6 = "Couldn't restore original file: "
            r4.append(r6)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0126 }
            r4.append(r0)     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0126 }
            r3.<init>(r0)     // Catch:{ all -> 0x0126 }
            throw r3     // Catch:{ all -> 0x0126 }
        L_0x011e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0126 }
            java.lang.String r4 = "Failed to save new file"
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
        L_0x0127:
            closeQuietly(r1)
            closeQuietly(r5)
            r2.delete()
            throw r0
        L_0x0131:
            r0 = move-exception
            r6 = r1
            goto L_0x013f
        L_0x0134:
            r0 = move-exception
            r6 = r1
        L_0x0136:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x013e }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x013e }
            throw r2     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
        L_0x013f:
            closeQuietly(r1)
            closeQuietly(r6)
            throw r0
        L_0x0146:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes on JPEG formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.saveAttributes():void");
    }

    public void setAltitude(double d) {
        String str = d >= ShadowDrawableWrapper.COS_45 ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, new Rational(Math.abs(d)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c0, code lost:
        r16 = r5;
        r5 = r3;
        r3 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02c5, code lost:
        r7.put(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0228, code lost:
        r3.put(r1, r5);
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022c, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02a8, code lost:
        r16 = r7;
        r7 = r3;
        r3 = r5;
        r5 = r16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0288  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAttribute(@androidx.annotation.NonNull java.lang.String r18, @androidx.annotation.Nullable java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "tag shouldn't be null"
            java.util.Objects.requireNonNull(r1, r3)
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            boolean r1 = DEBUG
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r4, r1)
        L_0x001e:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0020:
            r3 = 2
            r5 = 1
            if (r2 == 0) goto L_0x00aa
            java.util.HashSet<java.lang.String> r6 = sTagSetForCompatibility
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto L_0x00aa
            java.lang.String r6 = "GPSTimeStamp"
            boolean r6 = r1.equals(r6)
            java.lang.String r7 = " : "
            java.lang.String r8 = "Invalid value for "
            if (r6 == 0) goto L_0x0083
            java.util.regex.Pattern r6 = sGpsTimestampPattern
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r9 = r6.find()
            if (r9 != 0) goto L_0x004a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x0096
        L_0x004a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = r6.group(r5)
            int r7 = java.lang.Integer.parseInt(r7)
            r2.append(r7)
            java.lang.String r7 = "/1,"
            r2.append(r7)
            java.lang.String r8 = r6.group(r3)
            int r8 = java.lang.Integer.parseInt(r8)
            r2.append(r8)
            r2.append(r7)
            r7 = 3
            java.lang.String r6 = r6.group(r7)
            int r6 = java.lang.Integer.parseInt(r6)
            r2.append(r6)
            java.lang.String r6 = "/1"
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            goto L_0x00aa
        L_0x0083:
            double r9 = java.lang.Double.parseDouble(r19)     // Catch:{ NumberFormatException -> 0x0091 }
            androidx.exifinterface.media.ExifInterface$Rational r6 = new androidx.exifinterface.media.ExifInterface$Rational     // Catch:{ NumberFormatException -> 0x0091 }
            r6.<init>(r9)     // Catch:{ NumberFormatException -> 0x0091 }
            java.lang.String r2 = r6.toString()     // Catch:{ NumberFormatException -> 0x0091 }
            goto L_0x00aa
        L_0x0091:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x0096:
            r3.append(r8)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r4, r1)
            return
        L_0x00aa:
            r6 = 0
            r7 = r6
        L_0x00ac:
            androidx.exifinterface.media.ExifInterface$ExifTag[][] r8 = EXIF_TAGS
            int r8 = r8.length
            if (r6 >= r8) goto L_0x02d0
            r8 = 4
            if (r6 != r8) goto L_0x00ba
            boolean r8 = r0.mHasThumbnail
            if (r8 != 0) goto L_0x00ba
            goto L_0x02ca
        L_0x00ba:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifTag>[] r8 = sExifTagMapsForWriting
            r8 = r8[r6]
            java.lang.Object r8 = r8.get(r1)
            androidx.exifinterface.media.ExifInterface$ExifTag r8 = (androidx.exifinterface.media.ExifInterface.ExifTag) r8
            if (r8 == 0) goto L_0x02ca
            if (r2 != 0) goto L_0x00d1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            r3.remove(r1)
            goto L_0x02ca
        L_0x00d1:
            android.util.Pair r9 = guessDataFormat(r2)
            int r10 = r8.primaryFormat
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x018f
            int r10 = r8.primaryFormat
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x00f0
            goto L_0x018f
        L_0x00f0:
            int r10 = r8.secondaryFormat
            if (r10 == r12) goto L_0x010e
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x010a
            int r10 = r8.secondaryFormat
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x010e
        L_0x010a:
            int r3 = r8.secondaryFormat
            goto L_0x0191
        L_0x010e:
            int r10 = r8.primaryFormat
            if (r10 == r5) goto L_0x018d
            r11 = 7
            if (r10 == r11) goto L_0x018d
            if (r10 != r3) goto L_0x0119
            goto L_0x018d
        L_0x0119:
            boolean r3 = DEBUG
            if (r3 == 0) goto L_0x02ca
            java.lang.String r3 = "Given tag ("
            java.lang.String r7 = ") value didn't match with one of expected formats: "
            java.lang.StringBuilder r3 = b.e.a.a.a.C(r3, r1, r7)
            java.lang.String[] r7 = IFD_FORMAT_NAMES
            int r10 = r8.primaryFormat
            r10 = r7[r10]
            r3.append(r10)
            int r10 = r8.secondaryFormat
            java.lang.String r11 = ""
            java.lang.String r13 = ", "
            if (r10 != r12) goto L_0x0138
            r8 = r11
            goto L_0x0147
        L_0x0138:
            java.lang.StringBuilder r10 = b.e.a.a.a.y(r13)
            int r8 = r8.secondaryFormat
            r8 = r7[r8]
            r10.append(r8)
            java.lang.String r8 = r10.toString()
        L_0x0147:
            r3.append(r8)
            java.lang.String r8 = " (guess: "
            r3.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r7[r8]
            r3.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x0167
            goto L_0x017c
        L_0x0167:
            java.lang.StringBuilder r8 = b.e.a.a.a.y(r13)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7 = r7[r9]
            r8.append(r7)
            java.lang.String r11 = r8.toString()
        L_0x017c:
            r3.append(r11)
            java.lang.String r7 = ")"
            r3.append(r7)
            java.lang.String r3 = r3.toString()
        L_0x0188:
            android.util.Log.d(r4, r3)
            goto L_0x02ca
        L_0x018d:
            r3 = r10
            goto L_0x0191
        L_0x018f:
            int r3 = r8.primaryFormat
        L_0x0191:
            java.lang.String r8 = "/"
            java.lang.String r9 = ","
            switch(r3) {
                case 1: goto L_0x02b8;
                case 2: goto L_0x02af;
                case 3: goto L_0x0288;
                case 4: goto L_0x0267;
                case 5: goto L_0x022f;
                case 6: goto L_0x0198;
                case 7: goto L_0x02af;
                case 8: goto L_0x0198;
                case 9: goto L_0x0208;
                case 10: goto L_0x01d2;
                case 11: goto L_0x0198;
                case 12: goto L_0x01ae;
                default: goto L_0x0198;
            }
        L_0x0198:
            boolean r7 = DEBUG
            if (r7 == 0) goto L_0x02ca
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Data format isn't one of expected formats: "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            goto L_0x0188
        L_0x01ae:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r8 = r3.length
            double[] r8 = new double[r8]
        L_0x01b5:
            int r9 = r3.length
            if (r7 >= r9) goto L_0x01c3
            r9 = r3[r7]
            double r9 = java.lang.Double.parseDouble(r9)
            r8[r7] = r9
            int r7 = r7 + 1
            goto L_0x01b5
        L_0x01c3:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createDouble((double[]) r8, (java.nio.ByteOrder) r7)
            r3.put(r1, r7)
            goto L_0x02ca
        L_0x01d2:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r9 = r3.length
            androidx.exifinterface.media.ExifInterface$Rational[] r9 = new androidx.exifinterface.media.ExifInterface.Rational[r9]
            r10 = r7
        L_0x01da:
            int r11 = r3.length
            if (r7 >= r11) goto L_0x01fd
            r11 = r3[r7]
            java.lang.String[] r11 = r11.split(r8, r12)
            androidx.exifinterface.media.ExifInterface$Rational r13 = new androidx.exifinterface.media.ExifInterface$Rational
            r10 = r11[r10]
            double r14 = java.lang.Double.parseDouble(r10)
            long r14 = (long) r14
            r5 = r11[r5]
            double r10 = java.lang.Double.parseDouble(r5)
            long r10 = (long) r10
            r13.<init>(r14, r10)
            r9[r7] = r13
            int r7 = r7 + 1
            r5 = 1
            r10 = 0
            goto L_0x01da
        L_0x01fd:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r5 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSRational((androidx.exifinterface.media.ExifInterface.Rational[]) r9, (java.nio.ByteOrder) r5)
            goto L_0x0228
        L_0x0208:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r5 = r3.length
            int[] r5 = new int[r5]
            r7 = 0
        L_0x0210:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x021e
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r5[r7] = r8
            int r7 = r7 + 1
            goto L_0x0210
        L_0x021e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r7 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createSLong((int[]) r5, (java.nio.ByteOrder) r7)
        L_0x0228:
            r3.put(r1, r5)
            r3 = 1
        L_0x022c:
            r5 = r3
            goto L_0x02ca
        L_0x022f:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r5 = r3.length
            androidx.exifinterface.media.ExifInterface$Rational[] r5 = new androidx.exifinterface.media.ExifInterface.Rational[r5]
            r7 = 0
        L_0x0237:
            int r9 = r3.length
            if (r7 >= r9) goto L_0x025b
            r9 = r3[r7]
            java.lang.String[] r9 = r9.split(r8, r12)
            androidx.exifinterface.media.ExifInterface$Rational r10 = new androidx.exifinterface.media.ExifInterface$Rational
            r11 = 0
            r11 = r9[r11]
            double r11 = java.lang.Double.parseDouble(r11)
            long r11 = (long) r11
            r13 = 1
            r9 = r9[r13]
            double r13 = java.lang.Double.parseDouble(r9)
            long r13 = (long) r13
            r10.<init>(r11, r13)
            r5[r7] = r10
            int r7 = r7 + 1
            r12 = -1
            goto L_0x0237
        L_0x025b:
            r3 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r7 = r0.mAttributes
            r7 = r7[r6]
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r5 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createURational((androidx.exifinterface.media.ExifInterface.Rational[]) r5, (java.nio.ByteOrder) r8)
            goto L_0x02c5
        L_0x0267:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r7 = r3.length
            long[] r7 = new long[r7]
            r8 = 0
        L_0x026f:
            int r9 = r3.length
            if (r8 >= r9) goto L_0x027d
            r9 = r3[r8]
            long r9 = java.lang.Long.parseLong(r9)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x026f
        L_0x027d:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createULong((long[]) r7, (java.nio.ByteOrder) r8)
            goto L_0x02a8
        L_0x0288:
            java.lang.String[] r3 = r2.split(r9, r12)
            int r7 = r3.length
            int[] r7 = new int[r7]
            r8 = 0
        L_0x0290:
            int r9 = r3.length
            if (r8 >= r9) goto L_0x029e
            r9 = r3[r8]
            int r9 = java.lang.Integer.parseInt(r9)
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0290
        L_0x029e:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r3 = r3[r6]
            java.nio.ByteOrder r8 = r0.mExifByteOrder
            androidx.exifinterface.media.ExifInterface$ExifAttribute r7 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createUShort((int[]) r7, (java.nio.ByteOrder) r8)
        L_0x02a8:
            r16 = r7
            r7 = r3
            r3 = r5
            r5 = r16
            goto L_0x02c5
        L_0x02af:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r7 = r3[r6]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createString(r2)
            goto L_0x02c0
        L_0x02b8:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.ExifInterface$ExifAttribute>[] r3 = r0.mAttributes
            r7 = r3[r6]
            androidx.exifinterface.media.ExifInterface$ExifAttribute r3 = androidx.exifinterface.media.ExifInterface.ExifAttribute.createByte(r2)
        L_0x02c0:
            r16 = r5
            r5 = r3
            r3 = r16
        L_0x02c5:
            r7.put(r1, r5)
            goto L_0x022c
        L_0x02ca:
            int r6 = r6 + 1
            r3 = 2
            r7 = 0
            goto L_0x00ac
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.ExifInterface.setAttribute(java.lang.String, java.lang.String):void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDateTime(long j2) {
        setAttribute(TAG_DATETIME, sFormatter.format(new Date(j2)));
        setAttribute(TAG_SUBSEC_TIME, Long.toString(j2 % 1000));
    }

    public void setGpsInfo(Location location) {
        if (location != null) {
            setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
            setLatLong(location.getLatitude(), location.getLongitude());
            setAltitude(location.getAltitude());
            setAttribute(TAG_GPS_SPEED_REF, "K");
            setAttribute(TAG_GPS_SPEED, new Rational((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = sFormatter.format(new Date(location.getTime())).split("\\s+", -1);
            setAttribute(TAG_GPS_DATESTAMP, split[0]);
            setAttribute(TAG_GPS_TIMESTAMP, split[1]);
        }
    }

    public void setLatLong(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        } else {
            setAttribute(TAG_GPS_LATITUDE_REF, d >= ShadowDrawableWrapper.COS_45 ? "N" : LATITUDE_SOUTH);
            setAttribute(TAG_GPS_LATITUDE, convertDecimalDegree(Math.abs(d)));
            setAttribute(TAG_GPS_LONGITUDE_REF, d2 >= ShadowDrawableWrapper.COS_45 ? LONGITUDE_EAST : LONGITUDE_WEST);
            setAttribute(TAG_GPS_LONGITUDE, convertDecimalDegree(Math.abs(d2)));
        }
    }
}
