package gll;

/**
 * This class provides the properties that are needed to be loaded for
 * setting up To Do List Maker workspace controls including language-dependent
 * text.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
public enum GoLogoLoPropertyType {
   
    /* THESE ARE THE NODES IN OUR APP */
         
    // THIS IS THE TDLM WORKSPACE PANE
    TDLM_PANE,
    TDLM_TO_DO_LIST_LABEL,
    GLL_LABEL,
    GLL_NONE,
    
    // ITEMS EDITING
    GLL_BORDER_PANE,
    GLL_LAYERS_PANE,
    GLL_COMPONENTS_PANE,
    CYCLE_OPTIONS,
    DEFAULT_CYCLE,
    DEFAULT_FONTFAMILY,
    DEFAULT_FONTSIZE,
   
    TDLM_ITEMS_PANE,
    GLL_ITEM_BUTTONS_PANE,
    TDLM_ADD_ITEM_BUTTON,
    TDLM_REMOVE_ITEM_BUTTON,
    GLL_ADD_TEXT_BUTTON,
    GLL_ADD_IMAGE_BUTTON,
    GLL_ADD_RECTANGLE_BUTTON,
    GLL_ADD_CIRCLE_BUTTON,
    GLL_ADD_TRIANGLE_BUTTON,
    GLL_BOLD_TEXT_BUTTON,
    GLL_ITAL_TEXT_BUTTON,
    GLL_TT1_TEXT_BUTTON,
    GLL_TT2_TEXT_BUTTON,
    GLL_UNDERLINE_TEXT_BUTTON,
    GLL_FONTFAMILY_COMBOBOX,
    GLL_FONTSIZE_COMBOBOX,
    GLL_BORDER_THICKNESS_SLIDER,
    GLL_BORDER_COLOR_PICKER,
    GLL_BORDER_RADIUS_SLIDER,
    
    GLL_BORDER_THICKNESS_LABEL,
    GLL_BORDER_COLOR_PICKER_LABEL,
    GLL_BORDER_RADIUS_LABEL,
    GLL_FOCUS_LABEL,
    GLL_FOCUS_DISTANCE_LABEL,
    GLL_CENTER_X_LABEL,
    GLL_CENTER_Y_LABEL,
    GLL_RADIUS_LABEL,
    GLL_CYCLEMETHOD_COMBOBOX_LABEL,
    GLL_STOP0_COLOR_PICKER_LABEL,
    GLL_STOP1_COLOR_PICKER_LABEL,
    GLL_ColorGradient_LABEL,

    GLL_FOCUS_SLIDER,
    GLL_FOCUS_DISTANCE_SLIDER,
    GLL_CENTER_X_SLIDER,
    GLL_CENTER_Y_SLIDER,
    GLL_RADIUS_SLIDER,
    GLL_CYCLEMETHOD_COMBOBOX,
    GLL_STOP0_COLOR_PICKER,
    GLL_STOP1_COLOR_PICKER,
    
    GLL_ITEMS_TABLE_VIEW,
    TDLM_CATEGORY_COLUMN,
    GLL_ORDER_COLUMN,
    GLL_NAME_COLUMN,
    GLL_TYPE_COLUMN,


    // FOOLPROOF SETTINGS
    TDLM_FOOLPROOF_SETTINGS,
    
    // DIALOG CONTROLS
    TDLM_ITEM_DIALOG_HEADER,
    TDLM_ITEM_DIALOG_ADD_HEADER_TEXT,
    TDLM_ITEM_DIALOG_EDIT_HEADER_TEXT,
    TDLM_ITEM_DIALOG_CATEGORY_PROMPT,
    TDLM_ITEM_DIALOG_CATEGORY_TEXT_FIELD,
    TDLM_ITEM_DIALOG_DESCRIPTION_PROMPT,
    TDLM_ITEM_DIALOG_DESCRIPTION_TEXT_FIELD,
    TDLM_ITEM_DIALOG_START_DATE_PROMPT,
    TDLM_ITEM_DIALOG_START_DATE_PICKER,
    TDLM_ITEM_DIALOG_COMPLETED_PROMPT,
    TDLM_ITEM_DIALOG_COMPLETED_CHECK_BOX,
    TDLM_ITEM_DIALOG_CONFIRM_PANE,
    TDLM_ITEM_DIALOG_OK_BUTTON,
    TDLM_ITEM_DIALOG_CANCEL_BUTTON,
    
    // THIS IS THE EXPORT TEMPLATE FILE NAME
    TDLM_EXPORT_TEMPLATE_FILE_NAME
}