import "./ui/ReactSkeleton.css";
import { Component, createElement } from "react";
import Skeleton from "@mui/material/Skeleton";

export default class ReactSkeleton extends Component {
    constructor(props) {
        super(props);

        this.state = {
            value: undefined
        };
    }

    determineVariant(variant) {
        switch (variant) {
            case "rectangular":
                variant = "rectangular";
                break;
            case "circular":
                variant = "circular";
                break;
            case "text":
                variant = "text";
                break;
            default:
                variant = "rectangular";
        }
    }

    determineAnimation(animation) {
        switch (animation) {
            case "wave":
                animation = "wave";
                break;
            case "pulse":
                animation = "pulse";
                break;
            default:
                animation = "wave";
        }
        return animation;
    }

    render() {
        return <Skeleton variant={this.determineVariant} animation={this.determineAnimation} />;
    }
}
